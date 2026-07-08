package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0drq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066800drq implements InterfaceC1066840dru {
    public Aweme LIZ;
    public AnchorCommonStruct LIZIZ;
    public String LIZJ;

    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        return R.raw.icon_newspaper_fill;
    }

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        String keyword;
        List listLJJLIIIJILLIZJL;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keyword, new String[]{"|"}, 0, 6)) == null) {
            return null;
        }
        return (String) C360560EBq.LIZ(listLJJLIIIJILLIZJL);
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZIZ() {
        String keyword;
        List listLJJLIIIJILLIZJL;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keyword, new String[]{"|"}, 0, 6)) == null) {
            return null;
        }
        return (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C1066800drq c1066800drq = new C1066800drq();
        c1066800drq.LIZJ = this.LIZJ;
        c1066800drq.LIZ = this.LIZ;
        c1066800drq.LIZIZ = this.LIZIZ;
        return c1066800drq;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        return C1065370dpX.LIZ(this);
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final void LIZJ(C2344009Gk c2344009Gk) {
        String schema;
        InterfaceC710290Rtb interfaceC710290RtbLIZ;
        C1066750drl c1066750drlLIZ;
        String authorUid;
        String aid;
        List<AnchorCommonStruct> anchors;
        String id;
        Activity activityLIZIZ;
        Activity activityLIZ;
        String str = this.LIZJ;
        Aweme aweme = this.LIZ;
        InterfaceC710290Rtb interfaceC710290RtbLIZ2 = C19513411Wa.LIZ();
        if (interfaceC710290RtbLIZ2 != null && ((C19513511Wb) interfaceC710290RtbLIZ2).LIZ() != null) {
            C1066750drl.LIZ(c2344009Gk, this.LIZIZ);
        }
        C1065370dpX.LIZIZ(this, str, aweme, c2344009Gk);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        int i = 0;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(R.string.m25);
                c1389890mGx.LJIIJJI();
                return;
            }
        }
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null && (interfaceC710290RtbLIZ = C19513411Wa.LIZ()) != null && (c1066750drlLIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            String str2 = this.LIZJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("anchor_type", EnumC1430380nKG.NEWS.getTYPENAME());
            Aweme aweme2 = this.LIZ;
            if (aweme2 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
                authorUid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            Aweme aweme3 = this.LIZ;
            if (aweme3 == null || (aid = aweme3.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("from_group_id", aid);
            AnchorCommonStruct anchorCommonStruct2 = this.LIZIZ;
            if (anchorCommonStruct2 != null && (id = anchorCommonStruct2.getId()) != null) {
                str3 = id;
            }
            c2344009Gk.LJIIIIZZ("anchor_id", str3);
            Aweme aweme4 = this.LIZ;
            if (aweme4 != null && (anchors = aweme4.getAnchors()) != null && anchors.size() > 1) {
                i = 1;
            }
            c2344009Gk.LIZJ(i, "multi_anchor");
            c1066750drlLIZ.LIZJ(contextLIZ, schema, new C1066760drm(c2344009Gk.LIZ));
        }
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1065370dpX.LIZJ(this, this.LIZJ, this.LIZ, c2344009Gk);
    }

    @Override // X.InterfaceC1066840dru
    public final boolean LJFF(int i, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        this.LIZJ = str;
        this.LIZIZ = anchorCommonStruct;
        if (anchorCommonStruct.getType() == EnumC1430380nKG.NEWS.getTYPE()) {
            return true;
        }
        return false;
    }
}
