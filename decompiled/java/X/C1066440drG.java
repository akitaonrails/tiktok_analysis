package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0drG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066440drG extends AbstractC1066890drz {
    public static boolean LLJILJILJ;
    public long LLJ;
    public Boolean LLJI;
    public Boolean LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1066450drH());

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS560S0100000_16(this, 697), new AwS560S0100000_16(this, 696), new AwS560S0100000_16(this, 695), null, null, 24);
    }

    public final IAnchorService LJJIJIIJI() {
        return (IAnchorService) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1066440drG();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE();
    }

    public C1066440drG() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CSZ(null), 3);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        String string;
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.isEmpty()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        IPrivacyService iPrivacyService = (IPrivacyService) ServiceManager.get().getService(IPrivacyService.class);
        if (iPrivacyService != null && (iPrivacyService.LIZ() || !iPrivacyService.LIZIZ())) {
            C201955140j.LJII(C563650M8t.LIZIZ, "filter editor pro captions anchor by user type");
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (LJJIJIIJI().isEditorProEnabled() && LJJIJIIJI().isEditorProCaptionNewFuncEnabled() && C1066460drI.LIZ() != 0) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String schema = ((AnchorCommonStruct) it2.next()).getSchema();
                    if (schema == null || schema.length() == 0) {
                        C201955140j.LJII(C563650M8t.LIZIZ, "filter editor pro captions anchor by illegal schema");
                        return EnumC1050190dR3.NOT_FOUND;
                    }
                }
            }
            try {
                AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJJZI(arrayList);
                if (anchorCommonStruct2.getExtra().length() > 0) {
                    Object objOpt = new JSONObject(anchorCommonStruct2.getExtra()).opt("is_hide");
                    if (objOpt == null || (string = objOpt.toString()) == null) {
                        string = "";
                    }
                    if (Intrinsics.LJFF("1", string)) {
                        C201955140j.LJII(C563650M8t.LIZIZ, "filter editor pro captions anchor by server field(is_hide)");
                        return EnumC1050190dR3.NOT_FOUND;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            return super.LJJJJLL(list);
        }
        C201955140j.LJII(C563650M8t.LIZIZ, "filter editor pro captions anchor by experiment");
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        if (LLJILJILJ) {
            return;
        }
        LJJIJ(new AwS595S0100000_16(this, 233));
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJ < 500) {
            return;
        }
        this.LLJ = jCurrentTimeMillis;
        this.LLJI = Boolean.valueOf(LJJIJIIJI().isCaptionAnchorLandingPageShown());
        this.LLJIJIL = Boolean.valueOf(LJJIJIIJI().isCaptionAnchorLandingPageShown());
        LJJII(c2344009Gk, true, true);
        LJJIJ(new AwS595S0100000_16(this, 232));
    }
}
