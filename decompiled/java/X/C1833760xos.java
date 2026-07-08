package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel$getLiveFragmentInfoList$1", f = "LiveReplayListViewModel.kt", l = {228}, m = "invokeSuspend")
public final class C1833760xos extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C1833770xot>>, Object> {
    public int LL;
    public final /* synthetic */ LiveReplayListViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833760xos(LiveReplayListViewModel liveReplayListViewModel, String str, long j, Integer num, InterfaceC1364105Vn<? super C1833760xos> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveReplayListViewModel;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1833760xos(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833760xos.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C1833770xot>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
