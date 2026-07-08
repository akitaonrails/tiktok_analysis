package com.bytedance.android.live.network.response.pb;

import X.C09CT;
import X.C1516680pZS;
import X.C1516700pZU;
import X.C1528350psH;
import java.io.IOException;

/* JADX INFO: loaded from: classes24.dex */
public class ProtoResponse {

    @C09CT("body")
    public byte[] body = new byte[0];

    @C09CT("header")
    public C1528350psH header;

    public static ProtoResponse LIZ(C1516680pZS c1516680pZS) throws IOException {
        ProtoResponse protoResponse = new ProtoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        protoResponse.body = c1516680pZS.LJII();
                    }
                } else {
                    C1528350psH c1528350psH = new C1528350psH();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 != -1) {
                            switch (iLJI2) {
                                case 1:
                                    c1528350psH.LIZ = (int) c1516680pZS.LJIIJJI();
                                    break;
                                case 2:
                                    c1528350psH.LIZIZ = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 3:
                                    c1528350psH.LIZJ = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 4:
                                    c1528350psH.LIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 5:
                                    c1528350psH.LJ = c1516680pZS.LJIIJJI();
                                    break;
                                case 6:
                                    c1528350psH.LJFF = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            c1516680pZS.LJ(jLIZJ2);
                            if (c1528350psH.LIZ != -1) {
                                if (c1528350psH.LJ != -1) {
                                    protoResponse.header = c1528350psH;
                                } else {
                                    throw new IOException("Invalid protobuf data: missing header.now!");
                                }
                            } else {
                                throw new IOException("Invalid protobuf data: missing header.statusCode!");
                            }
                        }
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                if (protoResponse.header != null) {
                    return protoResponse;
                }
                throw new IOException("Invalid protobuf data: response.header is null!");
            }
        }
    }
}
