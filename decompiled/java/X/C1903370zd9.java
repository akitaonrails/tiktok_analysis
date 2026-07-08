package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.lego.PreloadInboxTask;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903370zd9 {
    public static void LIZJ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        boolean z = PreloadInboxTask.LL;
        if (PreloadInboxTask.LLILLJJLI) {
            return;
        }
        PreloadInboxTask.LLILLJJLI = true;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("PreloadInboxTask", "preload onClickInbox start");
        if (C1904090zeJ.LIZ() > 0) {
            C1720106oR.LJI("InboxBoostHelper", "startBoostWhenClick");
            ArrayList arrayList = new ArrayList();
            if (((Boolean) C1904090zeJ.LIZJ.getValue()).booleanValue()) {
                arrayList.add("start_gc_block");
            }
            if (((Boolean) C1904090zeJ.LIZ.getValue()).booleanValue()) {
                arrayList.add("start_jit_block");
            }
            if (((Boolean) C1904090zeJ.LIZIZ.getValue()).booleanValue()) {
                arrayList.add("start_log_block");
            }
            if (((Boolean) C1904090zeJ.LIZLLL.getValue()).booleanValue()) {
                arrayList.add("start_boot_finish");
            }
            if (((Boolean) C1904090zeJ.LJ.getValue()).booleanValue()) {
                arrayList.add("start_do_frame");
            }
            if (((Boolean) C1904090zeJ.LJFF.getValue()).booleanValue()) {
                arrayList.add("thread_priority");
            }
            C20736916Cp.LIZ(arrayList);
        }
        C2252408s6.LIZ(AFwS217S0000000_28.get$arr$(203));
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILL();
        if (C1906580ziK.LIZ() && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && !C20673215v0.LIZ(R.layout.a_2, abstractC1387200mCcLIZIZ.LJIIIIZZ())) {
            C1906570ziJ.LIZJ(abstractC1387200mCcLIZIZ, R.layout.a_2, R.layout.a_2, R.layout.a_2);
        }
        C1720106oR.LJI("PreloadInboxTask", "preload onClickInbox end");
    }

    public static void LIZ(Object obj) {
        if (obj != null) {
            obj.hashCode();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(boolean r9) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903370zd9.LIZIZ(boolean):void");
    }
}
