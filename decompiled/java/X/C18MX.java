package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.PanelPerformanceMetrics;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18MX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MX extends AbstractC21673619ry<C18MV> {
    public final Activity LL;
    public final List<AnchorProductInfoModel> LLILLJJLI;
    public final AwemePruningModel LLILLL;
    public final IECommerceVideoService LLILZ;
    public final IECommerceAnchorService LLILZIL;
    public final Function1<Boolean, Unit> LLILZLL;
    public final LayoutInflater LLIZ;
    public final ArrayList<Integer> LLIZLLLIL = new ArrayList<>();
    public final ArrayList<Integer> LLJ = new ArrayList<>();
    public final ArrayList<Integer> LLJI = new ArrayList<>();
    public final Map<String, C21271218Mc> LLJIJIL = new LinkedHashMap();
    public final Map<String, C0NOH> LLJILJIL = new LinkedHashMap();
    public long LLJILJILJ = -1;
    public long LLJILLL = -1;
    public final boolean[] LLJJ;
    public final PanelPerformanceMetrics LLJJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07d1 A[PHI: r8
      0x07d1: PHI (r8v8 java.lang.Object) = (r8v18 java.lang.Object), (r8v19 java.lang.Object), (r8v20 java.lang.Object) binds: [B:369:0x07cd, B:215:0x04b2, B:217:0x04b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:416:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r30, final int r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18MX.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(this.LLIZ, R.layout.alk, viewGroup, false);
        if (viewTd != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(C446980Hfs.LIZ(this.LL, R.color.at));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            viewTd.setBackground(c384050F3z.LIZ(this.LL));
        }
        C18MV c18mv = new C18MV(viewTd, this.LL, this.LLILLJJLI, this.LLILLL, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLILZ, this.LLILZIL, this.LLJJI, this.LLILZLL);
        try {
            View view = c18mv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c18mv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c18mv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C18MV.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c18mv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c18mv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C18MV.class.getName();
        return c18mv;
    }

    public C18MX(Activity activity, List list, AwemePruningModel awemePruningModel, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, AwS611S0100000_32 awS611S0100000_32) {
        long jCurrentTimeMillis;
        Long l;
        this.LL = activity;
        this.LLILLJJLI = list;
        this.LLILLL = awemePruningModel;
        this.LLILZ = iECommerceVideoService;
        this.LLILZIL = iECommerceAnchorService;
        this.LLILZLL = awS611S0100000_32;
        this.LLIZ = C786410Ut5.ne(activity);
        AnchorBizUtils.LIZ.getClass();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            i2 += 2;
            i3++;
        }
        this.LLJJ = new boolean[i3];
        if (awemePruningModel != null && (l = awemePruningModel.startClickTime) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LLJJI = new PanelPerformanceMetrics(jCurrentTimeMillis, false, true);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            int i4 = i + 1;
            if (i >= 0) {
                this.LLJ.add(Integer.valueOf(i));
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
