package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1628506Zf {
    public static final String LIZ(C869590Y9l c869590Y9l) {
        boolean z;
        Long l;
        String string;
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportShowCustomization()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        String str = c869590Y9l.getLocalExt().get("customizeId");
        if (str != null) {
            if (str.length() == 0 || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                return null;
            }
            return str;
        }
        PersistentExtraData persistentExtraDataLJIIIIZZ = C0ZDX.LJIIIIZZ(c869590Y9l);
        if (persistentExtraDataLJIIIIZZ == null || (l = persistentExtraDataLJIIIIZZ.bubbleStyleId) == null || (string = l.toString()) == null || string.length() == 0 || Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
            return null;
        }
        c869590Y9l.getLocalExt().put("customizeId", string);
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "customizeId", new C0Y3R(string), new C0Y3I("Bubble style cache"));
        return string;
    }
}
