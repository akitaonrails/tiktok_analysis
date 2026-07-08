package X;

import Y.AgS199S0200000_8;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene$PlaygroundTopTabCell$onBindItemView$2", f = "DMPlaygroundTopTabScene.kt", l = {99}, m = "invokeSuspend")
public final class C540880LJe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C540890LJf LLILLJJLI;
    public final /* synthetic */ DMPlaygroundTopTabScene.PlaygroundTopTabCell LLILLL;
    public final /* synthetic */ TuxTextView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540880LJe(C540890LJf c540890LJf, DMPlaygroundTopTabScene.PlaygroundTopTabCell playgroundTopTabCell, TuxTextView tuxTextView, InterfaceC1364105Vn<? super C540880LJe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c540890LJf;
        this.LLILLL = playgroundTopTabCell;
        this.LLILZ = tuxTextView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540880LJe(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMPlaygroundTopTabScene$PlaygroundTopTabCell@ae5.onBindItemView$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<AbstractC540910LJh> c05yd = this.LLILLJJLI.LLILLL;
            AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLL, this.LLILZ, 11);
            this.LL = 1;
            if (c05yd.collect(agS199S0200000_8, this) == objLJFF) {
                C1C7U.LIZIZ("DMPlaygroundTopTabScene$PlaygroundTopTabCell@ae5.onBindItemView$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
