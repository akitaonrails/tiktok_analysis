package X;

import android.os.Bundle;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.vision.request.MixPhotoSearchPreload;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS159S1100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0QeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.request.PhotoSearchPreloadManager$doPreload$1", f = "PhotoSearchPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C675300QeG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoSearchEnterParams LL;
    public final /* synthetic */ byte[] LLILLJJLI;
    public final /* synthetic */ SearchResultParam LLILLL;
    public final /* synthetic */ C676340Qfw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675300QeG(PhotoSearchEnterParams photoSearchEnterParams, byte[] bArr, SearchResultParam searchResultParam, C676340Qfw c676340Qfw, InterfaceC1364105Vn<? super C675300QeG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoSearchEnterParams;
        this.LLILLJJLI = bArr;
        this.LLILLL = searchResultParam;
        this.LLILZ = c676340Qfw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C675300QeG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer numLJ;
        long jLongValue;
        Long l;
        C1C7U.LIZ("PhotoSearchPreloadManager@8e33.doPreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PhotoSearchEnterParams photoSearchEnterParams = this.LL;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams;
        String str2 = null;
        if (photoSearchToolsEnterParams != null) {
            str = photoSearchToolsEnterParams.localFilePath;
        } else {
            str = null;
        }
        TypedByteArray typedByteArrayLIZIZ = C2365409Oq.LIZIZ(this.LLILLJJLI);
        C09HI.LIZ.getClass();
        if (!C09HJ.LIZ(str)) {
            str = null;
        }
        C674850QdX c674850QdXLIZIZ = C675090Qdv.LIZIZ(photoSearchEnterParams, new C676050QfT(typedByteArrayLIZIZ, null, null, null, null, null, str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C675310QeH.LIZ;
        C675310QeH.LIZ = System.currentTimeMillis();
        Long lLJFF = C2286608xc.LJFF(jCurrentTimeMillis - j);
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = this.LL.businessParams;
        if (photoSearchBusinessEnterParams != null) {
            numLJ = C2286608xc.LJ(photoSearchBusinessEnterParams.rootEnterFromType);
        } else {
            numLJ = null;
        }
        C675840Qf8.LIZ("preload_request", "search_result_preload", lLJFF, numLJ, null, null, 1008);
        C676340Qfw c676340Qfw = this.LLILZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams2 = this.LL.toolsParams;
        if (photoSearchToolsEnterParams2 != null && (l = photoSearchToolsEnterParams2.searchTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c676340Qfw.LIZLLL = C2286608xc.LJFF(jCurrentTimeMillis2 - jLongValue);
        this.LLILZ.LIZ = C2286608xc.LJFF(System.currentTimeMillis());
        MixPhotoSearchPreload.Companion.getClass();
        if (C04UK.LIZ()) {
            String strValueOf = String.valueOf(C674890Qdb.LIZ(c674850QdXLIZIZ, null).hashCode());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[photo][preload] start key=");
            sbLIZ.append(strValueOf);
            sbLIZ.append(" imageTosUri=");
            C676050QfT c676050QfT = c674850QdXLIZIZ.photoSearch;
            if (c676050QfT != null) {
                str2 = c676050QfT.imageTosUri;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            C2191431Aph c2191431Aph = C2191431Aph.LIZ;
            C675200Qe6<n> c675200Qe6 = C675190Qe5.LIZ;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("key_preload_hash", strValueOf));
            List listSingletonList = Collections.singletonList("key_preload_hash");
            long jCurrentTimeMillis3 = System.currentTimeMillis() + 30000;
            AwS159S1100000_10 awS159S1100000_10 = new AwS159S1100000_10(strValueOf, c674850QdXLIZIZ, 3);
            c2191431Aph.getClass();
            C2191431Aph.LJIIIIZZ(c675200Qe6, mapLIZJ, listSingletonList, jCurrentTimeMillis3, "mix search photo chunk preload stream is null", awS159S1100000_10);
        } else {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "photo_search_request", c674850QdXLIZIZ);
            C1524605y0.LIZ().LIZLLL(bundle, MixPhotoSearchPreload.class);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchPreloadManager@8e33.doPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
