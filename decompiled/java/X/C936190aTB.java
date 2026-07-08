package X;

import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936190aTB extends AbstractC1529700puS {
    public final /* synthetic */ C936170aT9 LIZ;
    public final /* synthetic */ Avatar LIZIZ;

    @Override // X.AbstractC1529700puS
    public final void LIZJ() {
        C936170aT9 c936170aT9 = this.LIZ;
        C09AJ<C936030aSv> c09aj = c936170aT9.LIZLLL;
        if (c09aj != null) {
            c09aj.onNext(new C936030aSv(c936170aT9, EnumC935940aSm.STATE_SUCCESS, 100, this.LIZIZ, null, 16));
        }
        C09AJ<C936030aSv> c09aj2 = this.LIZ.LIZLLL;
        if (c09aj2 != null) {
            c09aj2.onComplete();
        }
    }

    @Override // X.AbstractC1529700puS
    public final void LIZ(int i) {
        C936170aT9 c936170aT9 = this.LIZ;
        C09AJ<C936030aSv> c09aj = c936170aT9.LIZLLL;
        if (c09aj != null) {
            EnumC935940aSm enumC935940aSm = EnumC935940aSm.STATE_FAILED;
            Avatar avatar = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download_fail_");
            sbLIZ.append(i);
            c09aj.onNext(new C936030aSv(c936170aT9, enumC935940aSm, 0, avatar, C2188811AlT.LIZIZ(sbLIZ)));
        }
        C09AJ<C936030aSv> c09aj2 = this.LIZ.LIZLLL;
        if (c09aj2 != null) {
            c09aj2.onComplete();
        }
    }

    @Override // X.AbstractC1529700puS
    public final void LIZIZ(int i) {
        C936170aT9 c936170aT9 = this.LIZ;
        C09AJ<C936030aSv> c09aj = c936170aT9.LIZLLL;
        if (c09aj != null) {
            c09aj.onNext(new C936030aSv(c936170aT9, EnumC935940aSm.STATE_PROGRESS, ((i * 10) / 100) + 90, this.LIZIZ, null, 16));
        }
    }

    public C936190aTB(C936170aT9 c936170aT9, Avatar avatar) {
        this.LIZ = c936170aT9;
        this.LIZIZ = avatar;
    }
}
