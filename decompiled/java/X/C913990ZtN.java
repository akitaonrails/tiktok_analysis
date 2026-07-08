package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusSenderTimer;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem.ReadStateAssem;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ZtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913990ZtN implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(C913990ZtN c913990ZtN, Editable editable) {
    }

    public static final void beforeTextChanged$0(C913990ZtN c913990ZtN, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C913990ZtN c913990ZtN, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C913990ZtN c913990ZtN, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C913990ZtN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$1(C913990ZtN c913990ZtN, Editable editable) {
        C855040XgU c855040XgU = (C855040XgU) c913990ZtN.l0;
        String string = editable.toString();
        c855040XgU.getClass();
        if (TextUtils.isEmpty(string)) {
            c855040XgU.LIZLLL = true;
            return;
        }
        if (!c855040XgU.LIZLLL) {
            return;
        }
        if (TextUtils.isEmpty(c855040XgU.LIZIZ)) {
            ((ArrayList) c855040XgU.LIZ).add(string);
            c855040XgU.LIZIZ = string;
            return;
        }
        int length = c855040XgU.LIZIZ.length();
        int length2 = string.length();
        if (length == length2) {
            return;
        }
        if (length > length2) {
            c855040XgU.LIZLLL = false;
            c855040XgU.LIZIZ = null;
            ((ArrayList) c855040XgU.LIZ).clear();
        } else if (!string.startsWith(c855040XgU.LIZIZ)) {
            c855040XgU.LIZLLL = false;
            c855040XgU.LIZIZ = null;
            ((ArrayList) c855040XgU.LIZ).clear();
        } else {
            ((ArrayList) c855040XgU.LIZ).add(string.substring(length));
            c855040XgU.LIZIZ = string;
        }
    }

    public static final void onTextChanged$0(C913990ZtN c913990ZtN, CharSequence charSequence, int i, int i2, int i3) {
        InterfaceC892260YzQ interfaceC892260YzQ = (InterfaceC892260YzQ) ((ReadStateAssem) c913990ZtN.l0).bo().LLILZ.getValue();
        if (interfaceC892260YzQ != null) {
            interfaceC892260YzQ.lz0();
        }
        if (i3 != 0 || i != 0) {
            ITypingStatusSenderTimer.LIZ.getClass();
            ITypingStatusSenderTimer value = C0I2I.LIZIZ.getValue();
            if (value != null) {
                value.LIZ(((SessionInfo) ((ReadStateAssem) c913990ZtN.l0).LLILLJJLI.getValue()).getConversationId());
            }
        }
    }
}
