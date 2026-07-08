package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261650iw7 extends AbstractC1261840iwQ<C1261860iwS> {
    public final C1261860iwS LLILLJJLI;
    public final C1262090iwp LLILLL;
    public final C459680I0w LLILZ;
    public final C1261860iwS LLILZIL;
    public boolean LLILZLL;
    public Integer LLIZ;
    public Boolean LLIZLLLIL;
    public String LLJ;
    public final int LLJI;

    public final boolean LIZLLL() {
        return this.LLILZIL.isRelatedRec();
    }

    @Override // X.AbstractC1261840iwQ
    public final int hashCode() {
        return this.LLILZIL.getUid().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecUserItem(nickName: ");
        sbLIZ.append(this.LLILZIL.getNickname());
        sbLIZ.append(", uid: ");
        sbLIZ.append(this.LLILZIL.getUid());
        sbLIZ.append(",isRelated: ");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1261840iwQ
    public final /* bridge */ /* synthetic */ InterfaceC1262230ix3 LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1261840iwQ, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1261650iw7 c1261650iw7;
        C1261860iwS c1261860iwS;
        if ((interfaceC1891350zJl instanceof C1261650iw7) && (c1261650iw7 = (C1261650iw7) interfaceC1891350zJl) != null && (c1261860iwS = c1261650iw7.LLILZIL) != null && Intrinsics.LJFF(c1261860iwS.getUid(), this.LLILZIL.getUid()) && c1261860iwS.getFollowStatus() == this.LLILZIL.getFollowStatus() && Intrinsics.LJFF(c1261860iwS.getMatchedFriendStruct(), this.LLILZIL.getMatchedFriendStruct())) {
            C459680I0w c459680I0w = this.LLILZ;
            C459680I0w c459680I0w2 = ((C1261650iw7) interfaceC1891350zJl).LLILZ;
            c459680I0w.getClass();
            c459680I0w2.getClass();
            if (Intrinsics.LJFF(null, null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1261840iwQ
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1261650iw7)) {
            return false;
        }
        return areItemTheSame((InterfaceC1891350zJl) obj);
    }

    @Override // X.AbstractC1261840iwQ, X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1261650iw7)) {
            return C1600110rk1.LIZ("unknown");
        }
        C1261650iw7 c1261650iw7 = (C1261650iw7) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1261650iw7.LLILZIL.getUid(), this.LLILZIL.getUid())) {
            return C1600110rk1.LIZ("user");
        }
        if (c1261650iw7.LLILZIL.getFollowStatus() != this.LLILZIL.getFollowStatus()) {
            return C1600110rk1.LIZ("follow_status");
        }
        int i = c1261650iw7.LLJI;
        int i2 = this.LLJI;
        if (i != i2 && i2 > 0) {
            return C1600110rk1.LIZ("is_story");
        }
        return C1600110rk1.LIZJ();
    }

    public C1261650iw7(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        C459680I0w c459680I0w = new C459680I0w();
        this.LLILLJJLI = c1261860iwS;
        this.LLILLL = c1262090iwp;
        this.LLILZ = c459680I0w;
        this.LLILZIL = c1261860iwS;
        this.LLJI = C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, c1261860iwS.getUid());
    }
}
