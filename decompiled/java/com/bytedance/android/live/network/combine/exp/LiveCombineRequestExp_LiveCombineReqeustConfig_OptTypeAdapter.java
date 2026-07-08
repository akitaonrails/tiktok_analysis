package com.bytedance.android.live.network.combine.exp;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveCombineRequestExp_LiveCombineReqeustConfig_OptTypeAdapter extends TypeAdapter<LiveCombineRequestExp.LiveCombineReqeustConfig> {
    public final Gson LIZ;

    public LiveCombineRequestExp_LiveCombineReqeustConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCombineRequestExp.LiveCombineReqeustConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCombineRequestExp.LiveCombineReqeustConfig liveCombineReqeustConfig = new LiveCombineRequestExp.LiveCombineReqeustConfig(false, 0, false, 0, null, 0.0f, null, null, 0L, 511, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1910968899:
                        if (strLJJJJ.equals("max_combine_error_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setMaxCombineErrorCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1329856424:
                        if (strLJJJJ.equals("max_split_error_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setMaxSplitErrorCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1300183590:
                        if (strLJJJJ.equals("log_sample_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setLogSampleRate((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setEnableCombineRequest(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 160419693:
                        if (strLJJJJ.equals("retry_when_split_failed_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setRetryWhenSplitFailedList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 375919092:
                        if (strLJJJJ.equals("should_combine_failed_add_when_api_failure")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setShouldCombineFailedAddWhenApiFailure(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1014757015:
                        if (strLJJJJ.equals("dispatch_delay_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setDispatchDelayTimeMs(C473040Igo.LIZIZ(this.LIZ, c09cu, Long.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1303033934:
                        if (strLJJJJ.equals("request_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setRequestList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1748177132:
                        if (strLJJJJ.equals("combine_request_delay_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCombineReqeustConfig.setCombineRequestDelayTimeMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveCombineReqeustConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCombineRequestExp.LiveCombineReqeustConfig liveCombineReqeustConfig) throws IOException {
        LiveCombineRequestExp.LiveCombineReqeustConfig liveCombineReqeustConfig2 = liveCombineReqeustConfig;
        if (liveCombineReqeustConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveCombineReqeustConfig2.getEnableCombineRequest());
        c09dl.LJIILLIIL("max_combine_error_count");
        c09dl.LJJJJ(Integer.valueOf(liveCombineReqeustConfig2.getMaxCombineErrorCount()));
        c09dl.LJIILLIIL("should_combine_failed_add_when_api_failure");
        c09dl.LJJJJJL(liveCombineReqeustConfig2.getShouldCombineFailedAddWhenApiFailure());
        c09dl.LJIILLIIL("max_split_error_count");
        c09dl.LJJJJ(Integer.valueOf(liveCombineReqeustConfig2.getMaxSplitErrorCount()));
        c09dl.LJIILLIIL("request_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveCombineReqeustConfig2.getRequestList(), String.class);
        c09dl.LJIILLIIL("log_sample_rate");
        c09dl.LJJJJ(Float.valueOf(liveCombineReqeustConfig2.getLogSampleRate()));
        c09dl.LJIILLIIL("retry_when_split_failed_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveCombineReqeustConfig2.getRetryWhenSplitFailedList(), String.class);
        c09dl.LJIILLIIL("dispatch_delay_time_ms");
        C473040Igo.LJ(this.LIZ, c09dl, liveCombineReqeustConfig2.getDispatchDelayTimeMs(), Long.TYPE);
        c09dl.LJIILLIIL("combine_request_delay_time_ms");
        c09dl.LJJIZ(liveCombineReqeustConfig2.getCombineRequestDelayTimeMs());
        c09dl.LJII();
    }
}
