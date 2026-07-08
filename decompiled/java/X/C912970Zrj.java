package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment;

/* JADX INFO: renamed from: X.0Zrj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912970Zrj {
    public static void LIZ(C19EG c19eg, EnterChatParams enterChatParams) {
        if (c19eg == null) {
            return;
        }
        SelectChatMsgFragment selectChatMsgFragment = new SelectChatMsgFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "key_enter_chat_params", enterChatParams);
        selectChatMsgFragment.setArguments(bundle);
        int height = (int) (((double) c19eg.getWindow().getDecorView().getHeight()) * 0.9d);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = selectChatMsgFragment;
        c1390920mIc.LJI(48);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(2);
        c1390920mIc.LIZIZ(height, height);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "report_page_sheet");
    }
}
