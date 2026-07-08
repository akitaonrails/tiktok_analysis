package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchConcatFrameUtils$SearchConcatFrameHelper$bindKeyFramesAtTitle$1", f = "SearchConcatFrameUtils.kt", l = {285, 334}, m = "invokeSuspend")
public final class C436020H7w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public Function0 LLILLJJLI;
    public C436030H7x LLILLL;
    public Aweme LLILZ;
    public InterfaceC1631620sYq LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final /* synthetic */ C0H86 LLJIJIL;
    public final /* synthetic */ Function0<Map<SearchKeyFramePoint, AnonymousClass0957<Bitmap>>> LLJILJIL;
    public final /* synthetic */ C436030H7x LLJILJILJ;
    public final /* synthetic */ Aweme LLJILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Float, Float, Map<String, String>, Unit> LLJJ;
    public final /* synthetic */ Float LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C436020H7w(C0H86 c0h86, Function0<? extends Map<SearchKeyFramePoint, ? extends AnonymousClass0957<Bitmap>>> function0, C436030H7x c436030H7x, Aweme aweme, InterfaceC1631620sYq<? super Float, ? super Float, ? super Map<String, String>, Unit> interfaceC1631620sYq, Float f, InterfaceC1364105Vn<? super C436020H7w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = c0h86;
        this.LLJILJIL = function0;
        this.LLJILJILJ = c436030H7x;
        this.LLJILLL = aweme;
        this.LLJJ = interfaceC1631620sYq;
        this.LLJJI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436020H7w(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b8 -> B:7:0x0032). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C436020H7w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
