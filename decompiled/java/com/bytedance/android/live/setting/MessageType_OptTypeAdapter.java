package com.bytedance.android.live.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageType_OptTypeAdapter extends TypeAdapter<MessageType> {
    @Override // com.google.gson.TypeAdapter
    public final MessageType read(C09CU c09cu) {
        MessageType messageType = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            messageType = new MessageType(0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "per_message_frequency")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        messageType.threshold = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return messageType;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MessageType messageType) {
        MessageType messageType2 = messageType;
        if (messageType2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("per_message_frequency");
        c09dl.LJJJJ(Integer.valueOf(messageType2.threshold));
        c09dl.LJII();
    }
}
