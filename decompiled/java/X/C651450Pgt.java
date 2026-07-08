package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.xsearch.config.SearchEcomDecouplingChannelSettings;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import defpackage.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651450Pgt extends j {
    public final C651360Pgk LLILLL = new C651360Pgk();
    public final C651350Pgj LLILZ = new C651350Pgj();

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        boolean zLIZ;
        String containerID;
        String str2;
        C649040Pd0 c649040Pd0;
        String str3;
        DynamicPatch dynamicPatch;
        String containerID2;
        String str4;
        C649040Pd0 c649040Pd02;
        String str5;
        DynamicPatch dynamicPatch2;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        C1543110qG5 c1543110qG5;
        j.b bVar = (j.b) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null && (c1543110qG5 = c1543190qGD.LJIIIIZZ) != null) {
            str = c1543110qG5.LIZIZ;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name: ");
        sbLIZ.append(getName());
        sbLIZ.append(" channel: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            zLIZ = false;
        } else {
            zLIZ = SearchEcomDecouplingChannelSettings.LIZ(str);
        }
        String str6 = "";
        if (zLIZ) {
            final C651350Pgj c651350Pgj = this.LLILZ;
            c651350Pgj.getClass();
            c651350Pgj.LIZIZ = C647140PZw.LIZ.LIZ(CastIntegerProtector.parseInt(bVar.getSessionId()));
            j.d params = bVar.getParams();
            if (params != null && c651350Pgj.LIZIZ != null) {
                try {
                    SearchApiNew.RealApi realApiLIZ = SearchApiNew.LIZ();
                    String searchId = params.getSearchId();
                    if (searchId == null) {
                        searchId = "";
                    }
                    String query = params.getQuery();
                    if (query == null) {
                        query = "";
                    }
                    String backtrace = params.getBacktrace();
                    if (backtrace == null) {
                        backtrace = "";
                    }
                    String logId = params.getLogId();
                    if (logId == null) {
                        logId = "";
                    }
                    final String tokenType = params.getTokenType();
                    if (tokenType == null) {
                        tokenType = "";
                    }
                    Number cursor = params.getCursor();
                    if (cursor == null) {
                        cursor = 0;
                    }
                    long jLongValue = cursor.longValue();
                    final String searchResultId = params.getSearchResultId();
                    if (searchResultId == null) {
                        searchResultId = "";
                    }
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID2 = interfaceC634840OvC2.getContainerID();
                    } else {
                        containerID2 = null;
                    }
                    final j.c cVar = (j.c) C1909107dp.LIZJ(j.c.class, containerID2);
                    final String ecomApiVersion = params.getEcomApiVersion();
                    C649040Pd0 c649040Pd03 = c651350Pgj.LIZIZ;
                    if (c649040Pd03 == null || (str4 = c649040Pd03.LJFF) == null || str4.length() == 0 || ((c649040Pd02 = c651350Pgj.LIZIZ) != null && (dynamicPatch2 = c649040Pd02.LIZ) != null && dynamicPatch2.getOriginType() == 52)) {
                        C651460Pgu.LIZIZ.getClass();
                        if (C651460Pgu.LIZJ(tokenType)) {
                            C651460Pgu.LIZIZ.LIZ(this.IBridgeSdkContext, params, completionBlock, new InterfaceC651280Pgc() { // from class: X.0Pd1
                                @Override // X.InterfaceC651280Pgc
                                public final void LIZ(SearchHorizontalData searchHorizontalData, String str7) {
                                    Aweme aweme;
                                    DynamicPatch dynamicPatch3;
                                    List<Aweme> awemeList;
                                    C649040Pd0 c649040Pd04;
                                    DynamicPatch dynamicPatch4;
                                    List<Aweme> awemeList2;
                                    boolean disableMusicDspFreqCtrl;
                                    DynamicPatch dynamicPatch5;
                                    List<Aweme> awemeList3;
                                    C649040Pd0 c649040Pd05;
                                    DynamicPatch dynamicPatch6;
                                    List<Map<?, ?>> awemeListRaw;
                                    DynamicPatch dynamicPatch7;
                                    C649040Pd0 c649040Pd06 = c651350Pgj.LIZIZ;
                                    if (c649040Pd06 != null && (dynamicPatch7 = c649040Pd06.LIZ) != null && dynamicPatch7.getOriginType() == 52) {
                                        return;
                                    }
                                    if (searchHorizontalData != null) {
                                        List<? extends Map<?, ?>> list = searchHorizontalData.awemeListRaw;
                                        if (list != null && (c649040Pd05 = c651350Pgj.LIZIZ) != null && (dynamicPatch6 = c649040Pd05.LIZ) != null && (awemeListRaw = dynamicPatch6.getAwemeListRaw()) != null) {
                                            awemeListRaw.addAll(list);
                                        }
                                        List<Aweme> listLJ = searchHorizontalData.LJ();
                                        if (listLJ != null) {
                                            C651350Pgj c651350Pgj2 = c651350Pgj;
                                            String str8 = ecomApiVersion;
                                            String str9 = tokenType;
                                            String str10 = searchResultId;
                                            C649040Pd0 c649040Pd07 = c651350Pgj2.LIZIZ;
                                            if (c649040Pd07 != null && (dynamicPatch5 = c649040Pd07.LIZ) != null && (awemeList3 = dynamicPatch5.getAwemeList()) != null) {
                                                aweme = (Aweme) C13LP.LJJJLZIJ(0, awemeList3);
                                            } else {
                                                aweme = null;
                                            }
                                            for (Aweme aweme2 : (ArrayList) listLJ) {
                                                AwemeBizExtKt.setSearchFeedType(aweme2, "SearchLynxVideo");
                                                AwemeExtKt.appendExtraParamUseInSearch(aweme2, "token_type", str9);
                                                AwemeExtKt.appendExtraParamUseInSearch(aweme2, "search_result_id", str10);
                                                GlobalDoodleConfig globalDoodleConfig = searchHorizontalData.globalDoodleConfig;
                                                if (globalDoodleConfig != null) {
                                                    disableMusicDspFreqCtrl = globalDoodleConfig.getDisableMusicDspFreqCtrl();
                                                } else {
                                                    disableMusicDspFreqCtrl = false;
                                                }
                                                AwemeBizExtKt.setDisableMusicDspFreqCtrl(aweme2, disableMusicDspFreqCtrl);
                                                C643200PKs.LIZJ(aweme2, C643200PKs.LJ(aweme));
                                            }
                                            if (C123100dR.LIZ(str8) && (c649040Pd04 = c651350Pgj2.LIZIZ) != null && (dynamicPatch4 = c649040Pd04.LIZ) != null && (awemeList2 = dynamicPatch4.getAwemeList()) != null) {
                                                awemeList2.clear();
                                            }
                                            C649040Pd0 c649040Pd08 = c651350Pgj2.LIZIZ;
                                            if (c649040Pd08 != null && (dynamicPatch3 = c649040Pd08.LIZ) != null && (awemeList = dynamicPatch3.getAwemeList()) != null) {
                                                awemeList.addAll(listLJ);
                                            }
                                        }
                                    }
                                    C649040Pd0 c649040Pd09 = c651350Pgj.LIZIZ;
                                    if (c649040Pd09 != null) {
                                        c649040Pd09.LJFF = str7;
                                    }
                                }
                            });
                            return;
                        }
                        C11HU c11huLJJ = AbstractC19484711Kz.LJIJJ(realApiLIZ.LIZJ(ecomApiVersion, searchId, query, backtrace, logId, tokenType, jLongValue, null)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ());
                        final String str7 = tokenType;
                        final String str8 = searchResultId;
                        c11huLJJ.LIZ(new InterfaceC19474811He<String>() { // from class: X.0Pgh
                            @Override // X.InterfaceC19474811He
                            public final void onError(Throwable th) {
                                CompletionBlock<j.c> completionBlock2 = completionBlock;
                                String message = th.getMessage();
                                if (message == null) {
                                    message = "load more data fail";
                                }
                                C2382909Vj.LIZ(completionBlock2, -1, message, null, 4);
                            }

                            @Override // X.InterfaceC19474811He
                            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                                c651350Pgj.LIZ = interfaceC420801kM;
                            }

                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00d4 A[Catch: 0XIR -> 0x0138, TryCatch #0 {0XIR -> 0x0138, blocks: (B:3:0x0005, B:5:0x001f, B:7:0x0023, B:9:0x0029, B:11:0x002d, B:13:0x0033, B:14:0x0036, B:16:0x003b, B:18:0x0041, B:20:0x004e, B:22:0x0052, B:24:0x0058, B:25:0x005e, B:26:0x0065, B:28:0x006b, B:32:0x007b, B:54:0x00d4, B:35:0x0084, B:38:0x008d, B:52:0x00cc, B:40:0x0095, B:42:0x009b, B:45:0x00b2, B:47:0x00b7, B:49:0x00bb, B:50:0x00bf, B:44:0x00a3, B:56:0x00ee, B:58:0x00f4, B:60:0x00f8, B:62:0x00fc, B:64:0x0102, B:65:0x0105, B:67:0x0109, B:69:0x010d, B:71:0x0113, B:72:0x0116, B:74:0x011c, B:75:0x011e), top: B:83:0x0005 }] */
                            @Override // X.InterfaceC19474811He
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void onSuccess(java.lang.String r14) {
                                /*
                                    Method dump skipped, instruction units count: 350
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C651330Pgh.onSuccess(java.lang.Object):void");
                            }
                        });
                        return;
                    }
                    C649040Pd0 c649040Pd04 = c651350Pgj.LIZIZ;
                    if (c649040Pd04 == null || (str5 = c649040Pd04.LJFF) == null) {
                        str5 = "";
                    }
                    cVar.setData(str5);
                    completionBlock.onSuccess(cVar, "");
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C798280VTe.LIZ("LoadMoreSearchVideoList", e);
                    String message = e.getMessage();
                    if (message != null) {
                        str6 = message;
                    }
                    C2382909Vj.LIZ(completionBlock, -1, str6, null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, -1, "params null", null, 4);
            return;
        }
        final C651360Pgk c651360Pgk = this.LLILLL;
        c651360Pgk.getClass();
        c651360Pgk.LIZIZ = C647140PZw.LIZ.LIZ(CastIntegerProtector.parseInt(bVar.getSessionId()));
        j.d params2 = bVar.getParams();
        if (params2 != null && c651360Pgk.LIZIZ != null) {
            try {
                SearchApiNew.RealApi realApiLIZ2 = SearchApiNew.LIZ();
                String searchId2 = params2.getSearchId();
                if (searchId2 == null) {
                    searchId2 = "";
                }
                String query2 = params2.getQuery();
                if (query2 == null) {
                    query2 = "";
                }
                String backtrace2 = params2.getBacktrace();
                if (backtrace2 == null) {
                    backtrace2 = "";
                }
                String logId2 = params2.getLogId();
                if (logId2 == null) {
                    logId2 = "";
                }
                final String tokenType2 = params2.getTokenType();
                if (tokenType2 == null) {
                    tokenType2 = "";
                }
                Number cursor2 = params2.getCursor();
                if (cursor2 == null) {
                    cursor2 = 0;
                }
                long jLongValue2 = cursor2.longValue();
                final String searchResultId2 = params2.getSearchResultId();
                if (searchResultId2 == null) {
                    searchResultId2 = "";
                }
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID = null;
                }
                final j.c cVar2 = (j.c) C1909107dp.LIZJ(j.c.class, containerID);
                final String ecomApiVersion2 = params2.getEcomApiVersion();
                C649040Pd0 c649040Pd05 = c651360Pgk.LIZIZ;
                if (c649040Pd05 == null || (str2 = c649040Pd05.LJFF) == null || str2.length() == 0 || ((c649040Pd0 = c651360Pgk.LIZIZ) != null && (dynamicPatch = c649040Pd0.LIZ) != null && dynamicPatch.getOriginType() == 52)) {
                    C651460Pgu.LIZIZ.getClass();
                    if (C651460Pgu.LIZJ(tokenType2)) {
                        C651460Pgu.LIZIZ.LIZ(this.IBridgeSdkContext, params2, completionBlock, new InterfaceC651280Pgc() { // from class: X.0Pd2
                            @Override // X.InterfaceC651280Pgc
                            public final void LIZ(SearchHorizontalData searchHorizontalData, String str9) {
                                Aweme aweme;
                                DynamicPatch dynamicPatch3;
                                List<Aweme> awemeList;
                                C649040Pd0 c649040Pd06;
                                DynamicPatch dynamicPatch4;
                                List<Aweme> awemeList2;
                                boolean disableMusicDspFreqCtrl;
                                DynamicPatch dynamicPatch5;
                                List<Aweme> awemeList3;
                                C649040Pd0 c649040Pd07;
                                DynamicPatch dynamicPatch6;
                                List<Map<?, ?>> awemeListRaw;
                                DynamicPatch dynamicPatch7;
                                C649040Pd0 c649040Pd08 = c651360Pgk.LIZIZ;
                                if (c649040Pd08 != null && (dynamicPatch7 = c649040Pd08.LIZ) != null && dynamicPatch7.getOriginType() == 52) {
                                    return;
                                }
                                if (searchHorizontalData != null) {
                                    List<? extends Map<?, ?>> list = searchHorizontalData.awemeListRaw;
                                    if (list != null && (c649040Pd07 = c651360Pgk.LIZIZ) != null && (dynamicPatch6 = c649040Pd07.LIZ) != null && (awemeListRaw = dynamicPatch6.getAwemeListRaw()) != null) {
                                        awemeListRaw.addAll(list);
                                    }
                                    List<Aweme> listLJ = searchHorizontalData.LJ();
                                    if (listLJ != null) {
                                        C651360Pgk c651360Pgk2 = c651360Pgk;
                                        String str10 = ecomApiVersion2;
                                        String str11 = tokenType2;
                                        String str12 = searchResultId2;
                                        C649040Pd0 c649040Pd09 = c651360Pgk2.LIZIZ;
                                        if (c649040Pd09 != null && (dynamicPatch5 = c649040Pd09.LIZ) != null && (awemeList3 = dynamicPatch5.getAwemeList()) != null) {
                                            aweme = (Aweme) C13LP.LJJJLZIJ(0, awemeList3);
                                        } else {
                                            aweme = null;
                                        }
                                        for (Aweme aweme2 : (ArrayList) listLJ) {
                                            AwemeBizExtKt.setSearchFeedType(aweme2, "SearchLynxVideo");
                                            AwemeExtKt.appendExtraParamUseInSearch(aweme2, "token_type", str11);
                                            AwemeExtKt.appendExtraParamUseInSearch(aweme2, "search_result_id", str12);
                                            GlobalDoodleConfig globalDoodleConfig = searchHorizontalData.globalDoodleConfig;
                                            if (globalDoodleConfig != null) {
                                                disableMusicDspFreqCtrl = globalDoodleConfig.getDisableMusicDspFreqCtrl();
                                            } else {
                                                disableMusicDspFreqCtrl = false;
                                            }
                                            AwemeBizExtKt.setDisableMusicDspFreqCtrl(aweme2, disableMusicDspFreqCtrl);
                                            C643200PKs.LIZJ(aweme2, C643200PKs.LJ(aweme));
                                        }
                                        if (C123100dR.LIZ(str10) && (c649040Pd06 = c651360Pgk2.LIZIZ) != null && (dynamicPatch4 = c649040Pd06.LIZ) != null && (awemeList2 = dynamicPatch4.getAwemeList()) != null) {
                                            awemeList2.clear();
                                        }
                                        C649040Pd0 c649040Pd010 = c651360Pgk2.LIZIZ;
                                        if (c649040Pd010 != null && (dynamicPatch3 = c649040Pd010.LIZ) != null && (awemeList = dynamicPatch3.getAwemeList()) != null) {
                                            awemeList.addAll(listLJ);
                                        }
                                    }
                                }
                                C649040Pd0 c649040Pd011 = c651360Pgk.LIZIZ;
                                if (c649040Pd011 != null) {
                                    c649040Pd011.LJFF = str9;
                                }
                            }
                        });
                        return;
                    }
                    C11HU c11huLJJ2 = AbstractC19484711Kz.LJIJJ(realApiLIZ2.LIZJ(ecomApiVersion2, searchId2, query2, backtrace2, logId2, tokenType2, jLongValue2, null)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ());
                    final String str9 = tokenType2;
                    final String str10 = searchResultId2;
                    c11huLJJ2.LIZ(new InterfaceC19474811He<String>() { // from class: X.0Pgi
                        @Override // X.InterfaceC19474811He
                        public final void onError(Throwable th) {
                            CompletionBlock<j.c> completionBlock2 = completionBlock;
                            String message2 = th.getMessage();
                            if (message2 == null) {
                                message2 = "load more data fail";
                            }
                            C2382909Vj.LIZ(completionBlock2, -1, message2, null, 4);
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                            c651360Pgk.LIZ = interfaceC420801kM;
                        }

                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:54:0x00d4 A[Catch: 0XIR -> 0x0138, TryCatch #0 {0XIR -> 0x0138, blocks: (B:3:0x0005, B:5:0x001f, B:7:0x0023, B:9:0x0029, B:11:0x002d, B:13:0x0033, B:14:0x0036, B:16:0x003b, B:18:0x0041, B:20:0x004e, B:22:0x0052, B:24:0x0058, B:25:0x005e, B:26:0x0065, B:28:0x006b, B:32:0x007b, B:54:0x00d4, B:35:0x0084, B:38:0x008d, B:52:0x00cc, B:40:0x0095, B:42:0x009b, B:45:0x00b2, B:47:0x00b7, B:49:0x00bb, B:50:0x00bf, B:44:0x00a3, B:56:0x00ee, B:58:0x00f4, B:60:0x00f8, B:62:0x00fc, B:64:0x0102, B:65:0x0105, B:67:0x0109, B:69:0x010d, B:71:0x0113, B:72:0x0116, B:74:0x011c, B:75:0x011e), top: B:83:0x0005 }] */
                        @Override // X.InterfaceC19474811He
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onSuccess(java.lang.String r14) {
                            /*
                                Method dump skipped, instruction units count: 350
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C651340Pgi.onSuccess(java.lang.Object):void");
                        }
                    });
                    return;
                }
                C649040Pd0 c649040Pd06 = c651360Pgk.LIZIZ;
                if (c649040Pd06 == null || (str3 = c649040Pd06.LJFF) == null) {
                    str3 = "";
                }
                cVar2.setData(str3);
                completionBlock.onSuccess(cVar2, "");
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C798280VTe.LIZ("LoadMoreSearchVideoList", e2);
                String message2 = e2.getMessage();
                if (message2 != null) {
                    str6 = message2;
                }
                C2382909Vj.LIZ(completionBlock, -1, str6, null, 4);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, "params null", null, 4);
    }
}
