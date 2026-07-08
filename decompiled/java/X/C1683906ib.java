package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.service.IMessageViewHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1683906ib {
    public static final SpannableStringBuilder LIZ(int i, int i2, Function1<? super View, Unit> function1) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        String string = C894660Z7w.LIZ().getString(i2);
        c0i0b.LIZJ();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C894660Z7w.LIZ().getString(i, string));
        C1697806kq.LIZJ(spannableStringBuilder, string, 71, function1);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder LIZLLL(int i, boolean z, List list) {
        C1680206i0 c1680206i0LIZ;
        int i2 = i;
        if (i2 <= 0) {
            i2 = 1;
        }
        int iLIZ = C1671406ga.LIZ();
        List<IMUser> listLIZJ = C0YUN.LIZJ(list);
        C1360520lVa c1360520lVa = new C1360520lVa();
        ArrayList arrayList = (ArrayList) listLIZJ;
        int size = arrayList.size();
        if (size > i2) {
            size = i2;
        }
        if (arrayList.size() - i2 == 1) {
            size = arrayList.size() - 2;
        }
        List listSubList = arrayList.subList(0, size);
        int i3 = 0;
        for (Object obj : listSubList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                IMUser iMUser = (IMUser) obj;
                String displayName = iMUser.getDisplayName();
                if ((displayName == null || displayName.length() <= 0) && (displayName = iMUser.getUid()) == null) {
                    C0I0B.LJFF.LIZJ();
                    displayName = C894660Z7w.LIZ().getString(2131831188);
                }
                if (z) {
                    IMessageViewHelper.LIZ.getClass();
                    IMessageViewHelper iMessageViewHelperLIZ = C1672806go.LIZ();
                    if (iMessageViewHelperLIZ != null && (c1680206i0LIZ = iMessageViewHelperLIZ.LIZ(iLIZ, iMUser, "chat", null, null)) != null) {
                        SystemContent.Key key = new SystemContent.Key();
                        key.setAction(9);
                        c1680206i0LIZ.LLIZLLLIL = key;
                        c1360520lVa.LJFF(displayName, C1697810uHb.LJIIJJI(new C444920HcY(71, false), c1680206i0LIZ));
                    } else {
                        i3 = i4;
                    }
                } else {
                    c1360520lVa.LIZLLL(displayName);
                }
                if (i3 != listSubList.size() - 1) {
                    StringBuilder sb = new StringBuilder();
                    C0I0B.LJFF.LIZJ();
                    sb.append(C894660Z7w.LIZ().getString(2131831117));
                    sb.append(' ');
                    c1360520lVa.LIZIZ(sb.toString());
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (arrayList.size() > size) {
            C0I0B.LJFF.LIZJ();
            String string = C894660Z7w.LIZ().getResources().getString(2131835408, "{{%s}}", String.valueOf(arrayList.size() - size));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string);
            int iLJJJ = a0.LJJJ(spannableStringBuilder, "{{%s}}", 0, false, 6);
            return spannableStringBuilder.replace(iLJJJ, iLJJJ + 6, (CharSequence) c1360520lVa.LIZ);
        }
        return c1360520lVa.LIZ;
    }

    public static final SpannableStringBuilder LIZIZ(int i, SpannableStringBuilder spannableStringBuilder, String[] strArr, SpannableStringBuilder spannableStringBuilder2) {
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        try {
            spannableStringBuilder3.append((CharSequence) C894660Z7w.LIZ().getString(i, Arrays.copyOf(strArr, strArr.length)));
            int iLJJJ = a0.LJJJ(spannableStringBuilder3, "[[0]]", 0, false, 6);
            spannableStringBuilder3.replace(iLJJJ, iLJJJ + 5, (CharSequence) spannableStringBuilder);
            if (spannableStringBuilder2 != null) {
                int iLJJJ2 = a0.LJJJ(spannableStringBuilder3, "[[1]]", 0, false, 6);
                spannableStringBuilder3.replace(iLJJJ2, iLJJJ2 + 5, (CharSequence) spannableStringBuilder2);
                return spannableStringBuilder3;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return spannableStringBuilder3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder LIZJ(com.ss.android.ugc.aweme.im.message.content.GroupSystemContent r19, boolean r20, boolean r21, X.C869590Y9l r22) {
        /*
            Method dump skipped, instruction units count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683906ib.LIZJ(com.ss.android.ugc.aweme.im.message.content.GroupSystemContent, boolean, boolean, X.0Y9l):android.text.SpannableStringBuilder");
    }
}
