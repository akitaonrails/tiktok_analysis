package com.bef.effectsdk;

import com.bef.effectsdk.message.MessageCenter;

/* JADX INFO: loaded from: classes36.dex */
public class GPUProcessor {
    public static Listener sListener;

    public interface Listener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    public static void destroy() {
        MessageCenter.destroy();
        sListener = null;
    }

    public static void init() {
        MessageCenter.init();
        MessageCenter.setListener(new MessageCenter.Listener() { // from class: com.bef.effectsdk.GPUProcessor.1
            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public void onMessageReceived(int i, int i2, int i3, String str) {
                Listener listener = GPUProcessor.sListener;
                if (listener != null) {
                    listener.onMessageReceived(i, i2, i3, str);
                }
            }
        });
    }

    public static void setListener(Listener listener) {
        sListener = listener;
    }
}
