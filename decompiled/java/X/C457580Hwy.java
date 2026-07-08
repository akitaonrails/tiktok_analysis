package X;

import Y.AgS287S0100000_6;
import android.widget.EditText;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.edittext.CommonChatInputExtKt$subscribeToTxtWatcherEvent$3", f = "CommonChatInputExt.kt", l = {31}, m = "invokeSuspend")
public final class C457580Hwy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, TextWatcherViewModel> LLILLJJLI;
    public final /* synthetic */ EditText LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457580Hwy(AssemVMLazy<InterfaceC0148002o, TextWatcherViewModel> assemVMLazy, EditText editText, InterfaceC1364105Vn<? super C457580Hwy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = editText;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457580Hwy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonChatInputExtKt@1d8e.subscribeToTxtWatcherEvent$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy<InterfaceC0148002o, TextWatcherViewModel> assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457560Hww.LIZ;
            AnonymousClass0950 anonymousClass0950 = ((TextWatcherViewModel) assemVMLazy.getValue()).LLILZ;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 133);
            this.LL = 1;
            if (anonymousClass0950.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("CommonChatInputExtKt@1d8e.subscribeToTxtWatcherEvent$3");
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
