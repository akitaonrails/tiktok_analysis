package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.album.EPTrackFramePreLoader$getFromSystemAlbumThumbnail$2", f = "EPTrackFramePreLoader.kt", l = {136}, m = "invokeSuspend")
public final class C23242098u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public MediaModel LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ List<MediaModel> LLJIJIL;
    public final /* synthetic */ Context LLJILJIL;
    public final /* synthetic */ ConcurrentHashMap<C370820EgK, Bitmap> LLJILJILJ;
    public final /* synthetic */ List<MediaModel> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23242098u(List<? extends MediaModel> list, Context context, ConcurrentHashMap<C370820EgK, Bitmap> concurrentHashMap, List<MediaModel> list2, InterfaceC1364105Vn<? super C23242098u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = list;
        this.LLJILJIL = context;
        this.LLJILJILJ = concurrentHashMap;
        this.LLJILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23242098u c23242098u = new C23242098u(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
        c23242098u.LLJI = obj;
        return c23242098u;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x010d -> B:6:0x0039). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23242098u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
