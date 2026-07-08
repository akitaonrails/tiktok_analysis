package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.share.base.model.TargetClassItem;
import com.ss.android.ugc.aweme.share.base.model.TargetComponentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376080lug extends AbstractC1376390lvB {
    public final ShareChannelInfo LL;
    public Intent LLILLJJLI;
    public Intent LLILLL;
    public Intent LLILZ;

    @Override // X.AbstractC1376390lvB
    public final String LJJIJL() {
        return this.LL.packageName;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return this.LL.channelKey;
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return this.LL.labelName;
    }

    public C1376080lug(ShareChannelInfo shareChannelInfo) {
        this.LL = shareChannelInfo;
    }

    public static String LJJJJZ(int i, ShareChannelInfo shareChannelInfo) {
        List<TargetClassItem> list;
        TargetComponentInfo targetComponentInfo = shareChannelInfo.targetComponentInfo;
        if (targetComponentInfo != null && (list = targetComponentInfo.targetClassNameList) != null && !list.isEmpty()) {
            for (TargetClassItem targetClassItem : targetComponentInfo.targetClassNameList) {
                if (targetClassItem.shareMode == i) {
                    return targetClassItem.targetClassName;
                }
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011a A[PHI: r0
      0x011a: PHI (r0v26 android.graphics.drawable.Drawable) = (r0v16 android.graphics.drawable.Drawable), (r0v27 android.graphics.drawable.Drawable) binds: [B:44:0x00fb, B:21:0x0087] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.InterfaceC1369790lkX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LJJII(android.content.Context r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376080lug.LJJII(android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    public final Intent LJJJJJL(Context context, String str) {
        boolean z;
        boolean z2;
        List<Integer> list;
        List<Integer> list2;
        boolean z3;
        boolean z4;
        List<Integer> list3;
        List<Integer> list4;
        boolean z5;
        boolean z6;
        List<Integer> list5;
        List<Integer> list6;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        String type = intent.getType();
        boolean z7 = true;
        String str2 = "";
        Intent className = null;
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != 452781974) {
                if (iHashCode != 817335912) {
                    if (iHashCode == 1911932022 && type.equals("image/*")) {
                        String strLJJJJZ = LJJJJZ(4, this.LL);
                        if (strLJJJJZ != null && strLJJJJZ.length() != 0) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (!z5) {
                            TargetComponentInfo targetComponentInfo = this.LL.targetComponentInfo;
                            if (targetComponentInfo != null && (list6 = targetComponentInfo.shareModes) != null && !list6.contains(4)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!z6) {
                                TargetComponentInfo targetComponentInfo2 = this.LL.targetComponentInfo;
                                if (targetComponentInfo2 == null || (list5 = targetComponentInfo2.shareModes) == null || !list5.contains(4)) {
                                    z7 = false;
                                }
                                if (!z7) {
                                    return null;
                                }
                                String str3 = this.LL.packageName;
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                intent.setClassName(str2, strLJJJJZ);
                                return intent;
                            }
                        }
                        intent.setPackage(this.LL.packageName);
                    }
                } else if (type.equals("text/plain")) {
                    String strLJJJJZ2 = LJJJJZ(0, this.LL);
                    if (strLJJJJZ2 != null && strLJJJJZ2.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        TargetComponentInfo targetComponentInfo3 = this.LL.targetComponentInfo;
                        if (targetComponentInfo3 != null && (list4 = targetComponentInfo3.shareModes) != null && !list4.contains(0)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            TargetComponentInfo targetComponentInfo4 = this.LL.targetComponentInfo;
                            if (targetComponentInfo4 == null || (list3 = targetComponentInfo4.shareModes) == null || !list3.contains(0)) {
                                z7 = false;
                            }
                            if (z7) {
                                String str4 = this.LL.packageName;
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                intent.setClassName(str2, strLJJJJZ2);
                                return intent;
                            }
                            return LJJJJJL(context, "video/*");
                        }
                    }
                    intent.setPackage(this.LL.packageName);
                }
            } else if (type.equals("video/*")) {
                String strLJJJJZ3 = LJJJJZ(1, this.LL);
                if (strLJJJJZ3 != null && strLJJJJZ3.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    TargetComponentInfo targetComponentInfo5 = this.LL.targetComponentInfo;
                    if (targetComponentInfo5 != null && (list2 = targetComponentInfo5.shareModes) != null && !list2.contains(1)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        TargetComponentInfo targetComponentInfo6 = this.LL.targetComponentInfo;
                        if (targetComponentInfo6 == null || (list = targetComponentInfo6.shareModes) == null || !list.contains(1)) {
                            z7 = false;
                        }
                        if (!z7) {
                            return null;
                        }
                        String str5 = this.LL.packageName;
                        if (str5 != null) {
                            str2 = str5;
                        }
                        intent.setClassName(str2, strLJJJJZ3);
                        return intent;
                    }
                }
                intent.setPackage(this.LL.packageName);
            }
        }
        try {
            List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/h1PMFD2+hc9QKc7jvFHnp1k4I1kriqpdMZwRgzAYBP3V0L910iBsjg==", null));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
            Iterator it2 = listLJJJJZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ResolveInfo) it2.next()).activityInfo.name);
            }
            if (!(!arrayList.isEmpty())) {
                return null;
            }
            String str6 = this.LL.packageName;
            if (str6 != null) {
                str2 = str6;
            }
            className = intent.setClassName(str2, (String) arrayList.get(0));
            return className;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return className;
        }
    }

    @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
    public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
        Intent intentLJJJJJL = this.LLILLJJLI;
        if (intentLJJJJJL == null && (intentLJJJJJL = LJJJJJL(context, "text/plain")) == null) {
            return false;
        }
        intentLJJJJJL.putExtra("android.intent.extra.TEXT", AbstractC1376120luk.LIZ(c1371420lnA));
        return LJ(context, intentLJJJJJL);
    }

    @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
    public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
        Intent intentLJJJJJL = this.LLILLL;
        if (intentLJJJJJL == null) {
            intentLJJJJJL = LJJJJJL(context, "video/*");
        }
        String strLIZ = C1374110lrV.LIZ(c1374270lrl);
        if (intentLJJJJJL != null) {
            intentLJJJJJL.putExtra("android.intent.extra.STREAM", c1374270lrl.LIZIZ);
            intentLJJJJJL.putExtra("android.intent.extra.TEXT", strLIZ);
            return LJ(context, intentLJJJJJL);
        }
        return false;
    }

    @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
    public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
        Intent intentLJJJJJL = this.LLILZ;
        if (intentLJJJJJL == null) {
            intentLJJJJJL = LJJJJJL(context, "image/*");
        }
        String strLIZ = C1374110lrV.LIZ(c1375540lto);
        if (intentLJJJJJL != null) {
            intentLJJJJJL.putExtra("android.intent.extra.STREAM", c1375540lto.LIZIZ);
            intentLJJJJJL.putExtra("android.intent.extra.TEXT", strLIZ);
            return LJ(context, intentLJJJJJL);
        }
        return false;
    }
}
