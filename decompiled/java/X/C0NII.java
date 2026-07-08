package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.SignalCodeEnum;
import com.ss.android.ugc.aweme.feed.model.banner.StandardSignalStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagUiWrapper;
import com.ss.android.ugc.aweme.feed.model.banner.StandardUiTypeEnum;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NII, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NII implements InterfaceC590770NFb {
    public static volatile int LJ;
    public static volatile List<String> LJFF = new ArrayList();
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public final C054G LIZJ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 14)));
    public final Set<String> LIZLLL = new LinkedHashSet();

    @Override // X.InterfaceC590770NFb
    public final int LJI(C0NEN c0nen) {
        return 0;
    }

    @Override // X.InterfaceC590770NFb
    public final void LJII(C0NHH c0nhh) {
    }

    public static StandardTagStruct LIZ() {
        String strLJI = C20642515q3.LJI(2131838563);
        StandardTagKey standardTagKey = new StandardTagKey("high_tag_offline_tag", null);
        Boolean bool = Boolean.TRUE;
        StandardSignalStruct standardSignalStruct = new StandardSignalStruct(SignalCodeEnum.NONE.getType(), null, bool, bool);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"content\":{\"text\":\"");
        sbLIZ.append(strLJI);
        sbLIZ.append("\",\"text_color\":\"UIShapeText1OnNeutral\"},\"background_color\":\"FeedComponentsTextBackdrop2\"}");
        return new StandardTagStruct(standardTagKey, standardSignalStruct, new StandardTagUiWrapper(StandardUiTypeEnum.STANDARD.getType(), null, new FcpUiTemplate(101L, C2188811AlT.LIZIZ(sbLIZ), null, null), null), null, null);
    }

    @Override // X.InterfaceC590770NFb
    public final int getSize() {
        return C297230Bkv.LIZ() ? C625420Og0.LIZJ() : C625420Og0.LIZ();
    }

    @Override // X.InterfaceC590770NFb
    public final C0N9C LIZJ() {
        return C0N9C.OFFLINE_MODE;
    }

    @Override // X.InterfaceC590770NFb
    public final void LIZLLL(C0NHH c0nhh) {
        String aid;
        Aweme aweme = c0nhh.LIZLLL;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() > 0 && 1 != 0) {
            if (C297220Bku.LIZ() && C0NIZ.LIZIZ(c0nhh.LIZLLL) && LJ > 0 && !((ArrayList) LJFF).contains(aid)) {
                LJ = Math.max(0, LJ - 1);
                Aweme aweme2 = c0nhh.LIZLLL;
                if (aweme2 != null) {
                    AwemeBizExtKt.setOfflineUnwatchedCount(aweme2, LJ);
                }
                ((ArrayList) LJFF).add(aid);
            }
            C23250099c.LIZLLL(this.LIZJ, null, null, new C0NIY(aid, this, c0nhh, null), 3);
        }
    }

    @Override // X.InterfaceC590770NFb
    public final C591480NHu LJFF(C0NEN c0nen) {
        try {
            return (C591480NHu) C23250099c.LJ(C23271099x.INSTANCE, new C0NIH(this, c0nen, null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return new C591480NHu(false, (C0NHH) null, String.valueOf(e), 8);
        }
    }

    @Override // X.InterfaceC590770NFb
    public final C591480NHu LJIIIIZZ(C0NEN c0nen) {
        try {
            return (C591480NHu) C23250099c.LJ(C23271099x.INSTANCE, new C591490NHv(2, null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return new C591480NHu(false, (C0NHH) null, String.valueOf(e), 8);
        }
    }

    @Override // X.InterfaceC590770NFb
    public final void LJ(C0NEN c0nen, C0NEK c0nek) {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C590790NFd(c0nek, this, c0nen, null), 3);
    }
}
