package com.bytedance.android.live.network.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestPb_OptTypeAdapter extends TypeAdapter<RequestPb> {
    public final Gson LIZ;

    public RequestPb_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RequestPb read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RequestPb requestPb = new RequestPb();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -606897550) {
                        if (iHashCode == -85276958 && strLJJJJ.equals("switches")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                requestPb.switches = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("pass_through_api")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            requestPb.passThroughApi = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        requestPb.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return requestPb;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RequestPb requestPb) throws IOException {
        RequestPb requestPb2 = requestPb;
        if (requestPb2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(requestPb2.enable);
        c09dl.LJIILLIIL("switches");
        c09dl.LJJJJJ(requestPb2.switches);
        c09dl.LJIILLIIL("pass_through_api");
        c09dl.LJJJJJ(requestPb2.passThroughApi);
        c09dl.LJII();
    }
}
