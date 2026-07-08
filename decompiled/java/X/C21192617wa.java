package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;

/* JADX INFO: renamed from: X.17wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21192617wa implements InterfaceC21208317z7 {
    public final UsPopupCardVO LIZ;
    public final Long LIZIZ;

    @Override // X.InterfaceC21208317z7
    public final void onLoading() {
        EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.WAIT_GECKO;
        Long l = this.LIZIZ;
        C21192417wY.LJ(enumC21192517wZ, l != null ? l.toString() : null, String.valueOf(this.LIZ.popCardId), Integer.valueOf(this.LIZ.cardType), null, this.LIZ.chainInfo);
    }

    @Override // X.InterfaceC21208317z7
    public final void onShow() {
        EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.READY_TO_SHOW;
        Long l = this.LIZIZ;
        C21192417wY.LJ(enumC21192517wZ, l != null ? l.toString() : null, String.valueOf(this.LIZ.popCardId), Integer.valueOf(this.LIZ.cardType), null, this.LIZ.chainInfo);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" previous card show complete.ready to show lynx card.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
    }

    public C21192617wa(UsPopupCardVO usPopupCardVO, Long l) {
        this.LIZ = usPopupCardVO;
        this.LIZIZ = l;
    }

    @Override // X.InterfaceC21208317z7
    public final void LIZ(String str, boolean z) {
        String string;
        String str2 = str;
        String string2 = null;
        if (z) {
            EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.LYNX_RESOURCE_LOADED;
            Long l = this.LIZIZ;
            if (l != null) {
                string2 = l.toString();
            }
            C21192417wY.LJ(enumC21192517wZ, string2, String.valueOf(this.LIZ.popCardId), Integer.valueOf(this.LIZ.cardType), str2, this.LIZ.chainInfo);
            return;
        }
        EnumC21192517wZ enumC21192517wZ2 = EnumC21192517wZ.LYNX_LOAD_FAILED;
        Long l2 = this.LIZIZ;
        if (l2 != null) {
            string = l2.toString();
        } else {
            string = null;
        }
        String strValueOf = String.valueOf(this.LIZ.popCardId);
        Integer numValueOf = Integer.valueOf(this.LIZ.cardType);
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = "lynx view create failed";
            }
        } else {
            str2 = null;
        }
        C21192417wY.LJ(enumC21192517wZ2, string, strValueOf, numValueOf, str2, this.LIZ.chainInfo);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" lynx view create failed");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZJ(strLIZIZ);
    }
}
