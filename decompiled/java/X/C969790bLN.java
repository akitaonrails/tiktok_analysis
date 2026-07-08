package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.RecommendedPlaybookInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969790bLN implements InterfaceC1112400f3O {
    public long LL;
    public RecommendedPlaybookInfo LLILLJJLI;

    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    @Override // X.InterfaceC1112400f3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(X.C1112330f3H r49) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C969790bLN.LJIIIZ(X.0f3H):boolean");
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
        List<Long> list;
        Long l;
        RecommendedPlaybookInfo recommendedPlaybookInfo = this.LLILLJJLI;
        if (recommendedPlaybookInfo != null && (list = recommendedPlaybookInfo.playbookIds) != null && (l = (Long) C13LP.LJJJLL(list)) != null) {
            C500450Jjv.LIZ(c1112330f3H.LLIIIILZ().LJIIIZ, Long.valueOf(l.longValue()), "livesdk_pk_guide_show", "playbook_guide_capsule");
            C918210a0B.LIZIZ = true;
        }
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        String str;
        Long lLJJLIL;
        CapsuleBizParams capsuleBizParams = capsuleMessage.bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsCohost = capsuleBizParams.cohost) != null && (str = capsuleBizParamsCohost.rivalVoteCount) != null && (lLJJLIL = C500260Jjc.LJJLIL(str)) != null) {
            long jLongValue = lLJJLIL.longValue();
            this.LL = C915980Zwa.LIZLLL().getBattleId();
            RecommendedPlaybookInfo recommendedPlaybookInfo = new RecommendedPlaybookInfo();
            recommendedPlaybookInfo.playbookIds = C1697810uHb.LJIILJJIL(Long.valueOf(jLongValue));
            this.LLILLJJLI = recommendedPlaybookInfo;
            C978340bZA.LIZ = recommendedPlaybookInfo;
        }
        return false;
    }
}
