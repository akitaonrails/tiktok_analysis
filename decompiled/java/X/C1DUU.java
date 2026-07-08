package X;

import com.ss.android.ugc.aweme.creation.publish.album.IAlbumPreuploadManager;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1DUU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.MediaMsgSendManager$batchSendMediaMsgs$1", f = "MediaMsgSendManager.kt", l = {411}, m = "invokeSuspend")
public final class C1DUU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public IAlbumPreuploadManager LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public C259800zU LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final /* synthetic */ Map<String, String> LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ ArrayList<MediaModel> LLJILLL;
    public final /* synthetic */ Map<String, String> LLJJ;
    public final /* synthetic */ QuoteMode LLJJI;
    public final /* synthetic */ FeatureAttachmentData LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ C0YTK LLJJIJIL;
    public final /* synthetic */ BaseHeaderComponent LLJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DUU(Map<String, String> map, String str, ArrayList<MediaModel> arrayList, Map<String, String> map2, QuoteMode quoteMode, FeatureAttachmentData featureAttachmentData, int i, String str2, C0YTK c0ytk, BaseHeaderComponent baseHeaderComponent, InterfaceC1364105Vn<? super C1DUU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = map;
        this.LLJILJILJ = str;
        this.LLJILLL = arrayList;
        this.LLJJ = map2;
        this.LLJJI = quoteMode;
        this.LLJJIII = featureAttachmentData;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = str2;
        this.LLJJIJIL = c0ytk;
        this.LLJJJ = baseHeaderComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1DUU(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x076b  */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 2513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DUU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
