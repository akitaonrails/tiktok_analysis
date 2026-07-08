package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.album.EPTrackFramePreLoader$getThumbnailFromLocalFile$2", f = "EPTrackFramePreLoader.kt", l = {97}, m = "invokeSuspend")
public final class C23244098w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public MediaModel LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ List<MediaModel> LLJI;
    public final /* synthetic */ ConcurrentHashMap<C370820EgK, Bitmap> LLJIJIL;
    public final /* synthetic */ List<MediaModel> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23244098w(List<? extends MediaModel> list, ConcurrentHashMap<C370820EgK, Bitmap> concurrentHashMap, List<MediaModel> list2, InterfaceC1364105Vn<? super C23244098w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = list;
        this.LLJIJIL = concurrentHashMap;
        this.LLJILJIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23244098w c23244098w = new C23244098w(this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c23244098w.LLJ = obj;
        return c23244098w;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d5 -> B:6:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00db -> B:9:0x0065). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23244098w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
