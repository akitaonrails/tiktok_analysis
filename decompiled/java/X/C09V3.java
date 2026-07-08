package X;

import android.content.Context;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.performance.video.MinisPreloadVideoMetadata;
import com.ss.android.ugc.aweme.minis.settings.MinisPerfConfigSettings;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.09V3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09V3 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public static void LIZ(final Context context, SchemaParserData schemaParserData) {
        CharSequence charSequence;
        List<C080U> listLJIILJJIL;
        MinisPreloadVideoMetadata minisPreloadVideoMetadataLIZIZ;
        int i = C2187451AjH.LIZ;
        boolean z = MinisPerfConfigSettings.LIZ().videoPreloadEnable;
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadVideo, skip, videoPreloadEnable:");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = schemaParserData.videoResourcePreloadUrl;
        final String str = schemaParserData.clientKey;
        if (str != null && str.length() != 0 && (charSequence = (CharSequence) c259800zU.element) != null && charSequence.length() != 0) {
            String strLIZ = C1943007jI.LIZ((String) c259800zU.element, "x-tt-pns-dt-pass-id", "268959749");
            File fileLIZ = C08CZ.LIZ(context, str, (String) c259800zU.element, "mp4");
            File fileLIZ2 = C08CZ.LIZ(context, str, (String) c259800zU.element, "json");
            if (fileLIZ != null) {
                if (fileLIZ.exists() && (minisPreloadVideoMetadataLIZIZ = C08CZ.LIZIZ(fileLIZ2)) != null && C09V2.LIZIZ(minisPreloadVideoMetadataLIZIZ, Long.valueOf(fileLIZ.length()))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadVideo, already have, [CacheHit][file: ");
                    sbLIZ2.append(fileLIZ);
                    sbLIZ2.append("][filePath: ");
                    sbLIZ2.append(fileLIZ.getAbsolutePath());
                    sbLIZ2.append("][clientKey: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append("][baseUrl: ");
                    sbLIZ2.append((String) c259800zU.element);
                    sbLIZ2.append("], metadata:[");
                    sbLIZ2.append(minisPreloadVideoMetadataLIZIZ);
                    sbLIZ2.append(']');
                    C1720106oR.LIZ("minis-VideoResourceDownload", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                fileLIZ.delete();
            }
            if (fileLIZ2 != null) {
                fileLIZ2.delete();
            }
            int i2 = C09V6.LIZ;
            long j = MinisPerfConfigSettings.LIZ().videoPreloadSize;
            if (j <= 0 && j != -1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("downloadVideo, preloadSize:");
                sbLIZ3.append(j);
                sbLIZ3.append(", skip");
                C2188811AlT.LIZIZ(sbLIZ3);
                return;
            }
            synchronized (C1339000kws.LIZ()) {
            }
            INetworkApi iNetworkApi = (INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, strLIZ);
            C09V4 c09v4 = C09V4.PRELOAD_PARTIAL_VIDEO;
            if (MinisPerfConfigSettings.LIZ().videoPreloadSize == -1) {
                c09v4 = C09V4.PRELOAD_TOTAL_VIDEO;
            }
            int i3 = C09V5.LIZ[c09v4.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("bytes=0-");
                    sbLIZ4.append(j - 1);
                    listLJIILJJIL = C1697810uHb.LJIILJJIL(new C080U("Range", C2188811AlT.LIZIZ(sbLIZ4)));
                } else {
                    throw new C1954807lC();
                }
            } else {
                listLJIILJJIL = C1697810uHb.LJIILJJIL(new C080U("Range", "bytes=0-"));
            }
            listLJIILJJIL.add(new C080U("x-tt-dataflow-id", "671088912"));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("downloadVideo, netWorkApi:");
            sbLIZ5.append(iNetworkApi);
            sbLIZ5.append(", headers:");
            sbLIZ5.append(listLJIILJJIL);
            C2188811AlT.LIZIZ(sbLIZ5);
            iNetworkApi.downloadFile(false, -1, "", C2097608Jq.LJ(), listLJIILJJIL, null).enqueue(new C09SW<TypedInput>() { // from class: X.09V1
                @Override // X.C09SW
                public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
                    int i4 = C2187451AjH.LIZ;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:104:0x0224
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                @Override // X.C09SW
                public final void onAsyncResponse(X.C0X9S<com.bytedance.retrofit2.mime.TypedInput> r20, X.C0X52<com.bytedance.retrofit2.mime.TypedInput> r21) {
                    /*
                        Method dump skipped, instruction units count: 621
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C09V1.onAsyncResponse(X.0X9S, X.0X52):void");
                }

                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("downloadVideo, Download video failure: ");
                    sbLIZ6.append(th);
                    C2188811AlT.LIZIZ(sbLIZ6);
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                    int i4 = C2187451AjH.LIZ;
                }
            });
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("downloadVideo, skip, clientKey:");
        sbLIZ6.append(str);
        sbLIZ6.append(", baseUrl:");
        sbLIZ6.append((String) c259800zU.element);
        sbLIZ6.append(", schemaData:");
        sbLIZ6.append(schemaParserData);
        C2188811AlT.LIZIZ(sbLIZ6);
    }
}
