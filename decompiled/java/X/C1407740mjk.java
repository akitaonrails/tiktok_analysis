package X;

import com.ss.android.ugc.aweme.creation.publish.album.IAlbumPreuploadManager;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.MediaMsgSendManager$batchSendMediaMsgs$1$3", f = "MediaMsgSendManager.kt", l = {}, m = "invokeSuspend")
public final class C1407740mjk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<AbstractC2249061D1c<?, ?>> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ IAlbumPreuploadManager LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, C1157680gEQ> LLILZLL;
    public final /* synthetic */ Map<String, C1157720gEU> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407740mjk(List<AbstractC2249061D1c<?, ?>> list, List<String> list2, IAlbumPreuploadManager iAlbumPreuploadManager, String str, Map<String, C1157680gEQ> map, Map<String, C1157720gEU> map2, InterfaceC1364105Vn<? super C1407740mjk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = iAlbumPreuploadManager;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1407740mjk c1407740mjk = new C1407740mjk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1407740mjk.LL = obj;
        return c1407740mjk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaMsgSendManager@3ccc.batchSendMediaMsgs$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<AbstractC2249061D1c<?, ?>> list = this.LLILLJJLI;
        List<String> list2 = this.LLILLL;
        IAlbumPreuploadManager iAlbumPreuploadManager = this.LLILZ;
        String str = this.LLILZIL;
        Map<String, C1157680gEQ> map = this.LLILZLL;
        Map<String, C1157720gEU> map2 = this.LLIZ;
        int i = 0;
        for (AbstractC2249061D1c<?, ?> abstractC2249061D1c : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC2249061D1c<?, ?> abstractC2249061D1c2 = abstractC2249061D1c;
                String str2 = (String) C13LP.LJJJLZIJ(i, list2);
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() != 0) {
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1407750mjl(abstractC2249061D1c2, iAlbumPreuploadManager, str, str2, map, map2, null), 3);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaMsgSendManager@3ccc.batchSendMediaMsgs$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
