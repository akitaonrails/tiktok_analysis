package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0zD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887200zD4 extends AbstractC21673619ry<C1887210zD5> {
    public final Context LL;
    public final IAVSettingService LLILLJJLI = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
    public List<C1887220zD6> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C1887220zD6> list = this.LLILLL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C1887200zD4(Context context) {
        this.LL = context;
    }

    public final String LLLFZ(long j) {
        Locale locale;
        String str;
        IAVSettingService iAVSettingService = this.LLILLJJLI;
        if (((iAVSettingService == null || (locale = iAVSettingService.getLocale(iAVSettingService.getAppLanguage())) == null) && (locale = Locale.getDefault()) == null) || (str = new SimpleDateFormat("MMM dd, yyyy", locale).format(new Date(j))) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
        /*
            r9 = this;
            X.0zD5 r10 = (X.C1887210zD5) r10
            java.util.List<X.0zD6> r0 = r9.LLILLL
            if (r0 == 0) goto L8d
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r11)
            X.0zD6 r3 = (X.C1887220zD6) r3
            if (r3 == 0) goto L8d
            com.bytedance.tux.icon.TuxIconView r1 = r10.LLILLJJLI
            int r0 = r3.LIZIZ
            r1.setIconRes(r0)
            boolean r0 = r3.LIZJ
            if (r0 == 0) goto La3
            com.bytedance.tux.icon.TuxIconView r1 = r10.LLILLJJLI
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            r1.setTintColorRes(r0)
        L21:
            com.bytedance.tux.input.TuxTextView r1 = r10.LLILLL
            java.lang.String r0 = r3.LIZLLL
            r1.setText(r0)
            com.bytedance.tux.input.TuxTextView r6 = r10.LLILZ
            java.lang.Long r0 = r3.LJ
            r7 = 1
            r8 = 0
            if (r0 == 0) goto La0
            long r0 = r0.longValue()
            java.lang.String r5 = r3.LJFF
            r4 = 2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r8] = r5
            java.lang.String r0 = r9.LLLFZ(r0)
            r2[r7] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r0 = "%s · %s"
            java.lang.String r0 = X.C786410Ut5.j4(r0, r1)
            if (r0 == 0) goto La0
        L4d:
            r6.setText(r0)
            com.bytedance.tux.input.TuxTextView r6 = r10.LLILZIL
            java.lang.Long r0 = r3.LJI
            if (r0 == 0) goto L96
            long r4 = r0.longValue()
            android.content.Context r1 = r9.LL
            r0 = 2131821303(0x7f1102f7, float:1.9275345E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r9.LLLFZ(r4)
            r1[r8] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r7)
            java.lang.String r0 = X.C786410Ut5.j4(r2, r0)
            if (r0 == 0) goto L96
        L75:
            r6.setText(r0)
            java.lang.String r1 = r3.LJII
            if (r1 == 0) goto L8e
            com.bytedance.tux.input.TuxTextView r0 = r10.LLILZLL
            r0.setText(r1)
        L81:
            com.bytedance.tux.icon.TuxIconView r2 = r10.LLIZ
            Y.ACListenerS162S0100000_28 r1 = new Y.ACListenerS162S0100000_28
            r0 = 114(0x72, float:1.6E-43)
            r1.<init>(r3, r0)
            X.C786410Ut5.a9(r2, r1)
        L8d:
            return
        L8e:
            kotlin.jvm.internal.AwS572S0100000_28 r1 = new kotlin.jvm.internal.AwS572S0100000_28
            r0 = 825(0x339, float:1.156E-42)
            r1.<init>(r10, r0)
            goto L81
        L96:
            android.content.Context r1 = r9.LL
            r0 = 2131821304(0x7f1102f8, float:1.9275347E38)
            java.lang.String r0 = r1.getString(r0)
            goto L75
        La0:
            java.lang.String r0 = r3.LJFF
            goto L4d
        La3:
            com.bytedance.tux.icon.TuxIconView r0 = r10.LLILLJJLI
            r0.LIZ()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1887200zD4.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1887210zD5 c1887210zD5 = new C1887210zD5(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.zp, viewGroup, false));
        try {
            View view = c1887210zD5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1887210zD5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1887210zD5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1887210zD5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1887210zD5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1887210zD5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1887210zD5.class.getName();
        return c1887210zD5;
    }
}
