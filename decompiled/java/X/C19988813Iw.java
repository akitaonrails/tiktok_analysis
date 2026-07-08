package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.13Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class C19988813Iw extends C09AW implements InterfaceC1631620sYq<C13JB<Unit, AbstractC19979113Fd>, Unit, InterfaceC1364105Vn<? super AbstractC19979113Fd>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ C13JB LLILLL;
    public final /* synthetic */ C19988713Iv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19988813Iw(C19988713Iv c19988713Iv, InterfaceC1364105Vn<? super C19988813Iw> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c19988713Iv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C13JB<Unit, AbstractC19979113Fd> c13jb = this.LLILLL;
            byte bLJIJJLI = this.LLILZ.LIZ.LJIJJLI();
            if (bLJIJJLI == 1) {
                return this.LLILZ.LIZLLL(true);
            }
            if (bLJIJJLI == 0) {
                return this.LLILZ.LIZLLL(false);
            }
            if (bLJIJJLI == 6) {
                C19988713Iv c19988713Iv = this.LLILZ;
                this.LLILLJJLI = 1;
                obj = c19988713Iv.LIZJ(c13jb, this);
                if (obj == objLJFF) {
                    return objLJFF;
                }
            } else {
                if (bLJIJJLI == 8) {
                    return this.LLILZ.LIZIZ();
                }
                AbstractC19987713Il.LJIILLIIL(this.LLILZ.LIZ, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C13JB<Unit, AbstractC19979113Fd> c13jb, Unit unit, InterfaceC1364105Vn<? super AbstractC19979113Fd> interfaceC1364105Vn) {
        C19988813Iw c19988813Iw = new C19988813Iw(this.LLILZ, interfaceC1364105Vn);
        c19988813Iw.LLILLL = c13jb;
        return c19988813Iw.invokeSuspend(Unit.LIZ);
    }
}
