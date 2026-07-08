package com.bef.effectsdk.message;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes20.dex */
public class ResourceMonitor implements MessageInterceptor {
    public Listener mListener;

    public interface Listener {
        void onResourceLoadFinish(String str, boolean z);
    }

    @Override // com.bef.effectsdk.message.MessageInterceptor
    public void destroy() {
        this.mListener = null;
    }

    public void reset() {
    }

    @Override // com.bef.effectsdk.message.MessageInterceptor
    public boolean intercept(Message message) {
        Listener listener;
        if (17 != message.what) {
            return false;
        }
        String str = (String) HandlerHook.getMessageObj(message.obj);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int i = message.arg1;
        if (i != 3) {
            if (i == 4 && (listener = this.mListener) != null) {
                listener.onResourceLoadFinish(str, false);
            }
        } else {
            Listener listener2 = this.mListener;
            if (listener2 != null) {
                listener2.onResourceLoadFinish(str, true);
                return true;
            }
        }
        return true;
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }
}
