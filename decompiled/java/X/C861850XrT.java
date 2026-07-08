package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import njp.a;

/* JADX INFO: renamed from: X.0XrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.voiceclone.EditorProVoiceClonePanelComponent$showDeleteDialog$1$1$1", f = "EditorProVoiceClonePanelComponent.kt", l = {594}, m = "invokeSuspend")
public final class C861850XrT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19519311Yh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861850XrT(C19519311Yh c19519311Yh, InterfaceC1364105Vn<? super C861850XrT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19519311Yh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861850XrT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EditorProVoiceClonePanelComponent@dff1.showDeleteDialog$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.H5();
            C1DFB c1dfb = C0PEM.LIZJ;
            C05HU c05hu = new C05HU(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c05hu);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditorProVoiceClonePanelComponent@dff1.showDeleteDialog$1$1$1");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 0) {
            this.LLILLJJLI.N5("", "", null);
            this.LLILLJJLI.H4();
            Activity activityLJII = C1664590tQ1.LJII(this.LLILLJJLI);
            String string = C1664590tQ1.LJII(this.LLILLJJLI).getString(2131820772);
            C1389880mGw c1389880mGw = new C1389880mGw(activityLJII);
            c1389880mGw.LJIIIZ(string);
            c1389880mGw.LJIIJ();
            this.LLILLJJLI.i3(AFwS273S0000000_29.get$arr$(236));
        } else {
            C0EI7.LIZLLL(iIntValue, C1664590tQ1.LJII(this.LLILLJJLI));
            this.LLILLJJLI.H4();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProVoiceClonePanelComponent@dff1.showDeleteDialog$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
