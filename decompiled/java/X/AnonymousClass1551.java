package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1551, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.recommend.RecommendRepo$getMusicList$2", f = "RecommendRepo.kt", l = {81}, m = "invokeSuspend")
public final class AnonymousClass1551 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<MusicModel>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass1553 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1551(AnonymousClass1553 anonymousClass1553, boolean z, Context context, boolean z2, InterfaceC1364105Vn<? super AnonymousClass1551> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass1553;
        this.LLILZ = z;
        this.LLILZIL = context;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass1551 anonymousClass1551 = new AnonymousClass1551(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        anonymousClass1551.LLILLJJLI = obj;
        return anonymousClass1551;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1551.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<MusicModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
