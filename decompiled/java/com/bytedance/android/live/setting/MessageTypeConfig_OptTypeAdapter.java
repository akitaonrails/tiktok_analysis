package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageTypeConfig_OptTypeAdapter extends TypeAdapter<MessageTypeConfig> {
    public final Gson LIZ;

    public MessageTypeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MessageTypeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MessageTypeConfig messageTypeConfig = new MessageTypeConfig(null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1268958287:
                        if (strLJJJJ.equals("follow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageTypeConfig.followFreq = (MessageType) this.LIZ.LJIIJ(MessageType.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1006804125:
                        if (strLJJJJ.equals("others")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageTypeConfig.othersFreq = (MessageType) this.LIZ.LJIIJ(MessageType.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3172656:
                        if (strLJJJJ.equals("gift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageTypeConfig.giftFreq = (MessageType) this.LIZ.LJIIJ(MessageType.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109400031:
                        if (strLJJJJ.equals("share")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageTypeConfig.shareFreq = (MessageType) this.LIZ.LJIIJ(MessageType.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 950398559:
                        if (strLJJJJ.equals("comment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageTypeConfig.commentFreq = (MessageType) this.LIZ.LJIIJ(MessageType.class).read(c09cu);
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
        return messageTypeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MessageTypeConfig messageTypeConfig) {
        MessageTypeConfig messageTypeConfig2 = messageTypeConfig;
        if (messageTypeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gift");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(MessageType.class);
        typeAdapterLJIIJ.write(c09dl, messageTypeConfig2.giftFreq);
        c09dl.LJIILLIIL("share");
        typeAdapterLJIIJ.write(c09dl, messageTypeConfig2.shareFreq);
        c09dl.LJIILLIIL("follow");
        typeAdapterLJIIJ.write(c09dl, messageTypeConfig2.followFreq);
        c09dl.LJIILLIIL("comment");
        typeAdapterLJIIJ.write(c09dl, messageTypeConfig2.commentFreq);
        c09dl.LJIILLIIL("others");
        typeAdapterLJIIJ.write(c09dl, messageTypeConfig2.othersFreq);
        c09dl.LJII();
    }
}
