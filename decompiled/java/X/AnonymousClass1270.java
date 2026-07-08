package X;

import Y.ACListenerS163S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.trill.setting.ImagesData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1270, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1270 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final AnonymousClass1274 LL;
    public boolean LLILLJJLI;
    public List<C197031126z> LLILLL = C13BV.INSTANCE;
    public boolean LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int iLLLFZ;
        boolean z = this.LLILLJJLI;
        if (this.LLILZ) {
            iLLLFZ = this.LLILLL.size();
        } else {
            iLLLFZ = LLLFZ() + (LLLFZ() <= this.LLILLL.size() ? 1 : 0);
        }
        return (z ? 1 : 0) + iLLLFZ;
    }

    public final int LLLFZ() {
        ContentLanguage[] contentLanguageArrLIZ = C07MP.LIZ();
        String appLanguage = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
        if (contentLanguageArrLIZ.length == 0) {
            List<C197031126z> list = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            for (C197031126z c197031126z : list) {
                if (Intrinsics.LJFF(c197031126z.LIZ, appLanguage)) {
                    arrayList.add(c197031126z);
                }
            }
            return arrayList.size();
        }
        List<C197031126z> list2 = this.LLILLL;
        ArrayList arrayList2 = new ArrayList();
        for (C197031126z c197031126z2 : list2) {
            if (Intrinsics.LJFF(c197031126z2.LIZ, appLanguage)) {
                arrayList2.add(c197031126z2);
            }
        }
        int size = arrayList2.size();
        List<C197031126z> list3 = this.LLILLL;
        ArrayList arrayList3 = new ArrayList();
        for (C197031126z c197031126z3 : list3) {
            C197031126z c197031126z4 = c197031126z3;
            int length = contentLanguageArrLIZ.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ContentLanguage contentLanguage = contentLanguageArrLIZ[i];
                    if (!Intrinsics.LJFF(contentLanguage.getLanguageCode(), appLanguage) && Intrinsics.LJFF(c197031126z4.LIZ, contentLanguage.getLanguageCode())) {
                        arrayList3.add(c197031126z3);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList3.size() + size;
    }

    public AnonymousClass1270(AnonymousClass1274 anonymousClass1274) {
        this.LL = anonymousClass1274;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LLILLJJLI) {
            if (i == 0) {
                return 0;
            }
            if (!this.LLILZ && i >= LLLFZ() + 1) {
                return 2;
            }
            return 1;
        }
        if (!this.LLILZ && i >= LLLFZ()) {
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AnonymousClass1271 anonymousClass1271;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        AnonymousClass1272 anonymousClass1272;
        Object c098200Yq;
        String str;
        SmartImageView smartImageView;
        int itemViewType = getItemViewType(i);
        Object obj = null;
        if (itemViewType == 0) {
            if ((viewHolder instanceof AnonymousClass1272) && (anonymousClass1272 = (AnonymousClass1272) viewHolder) != null) {
                try {
                    c098200Yq = (ImagesData) SettingsManager.LIZLLL().LJIIIIZZ("content_language_panel_images", ImagesData.class, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                ImagesData imagesData = (ImagesData) obj;
                if (imagesData != null && (str = imagesData.lightUrl) != null && (smartImageView = (SmartImageView) anonymousClass1272.LL.getValue()) != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ(smartImageView);
                    c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_INSIDE;
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    return;
                }
                return;
            }
            return;
        }
        if (itemViewType == 1) {
            if ((viewHolder instanceof AnonymousClass1271) && (anonymousClass1271 = (AnonymousClass1271) viewHolder) != null) {
                C259800zU c259800zU = new C259800zU();
                ?? r0 = ListProtector.get(this.LLILLL, i - (this.LLILLJJLI ? 1 : 0));
                c259800zU.element = r0;
                anonymousClass1271.LL.setTitle(((C197031126z) r0).LIZIZ);
                boolean zLJIILIIL = anonymousClass1271.LLILLJJLI.LJIILIIL();
                boolean z = ((C197031126z) c259800zU.element).LIZJ;
                if (zLJIILIIL != z) {
                    anonymousClass1271.LLILLJJLI.LJIILJJIL(z);
                }
                anonymousClass1271.LLILLJJLI.LJIILLIIL(new C12YC(this, c259800zU, 0));
                if (i == 0) {
                    anonymousClass1271.LL.LJ(true, false);
                    C426750GoL.LJIIIZ(anonymousClass1271.LL, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 0, false, 21);
                    return;
                }
                if (i == getItemCount() - 1) {
                    anonymousClass1271.LL.LJ(false, true);
                    C127K c127k = anonymousClass1271.LL;
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    if (this.LLILLJJLI) {
                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    } else {
                        iLIZIZ3 = 0;
                    }
                    if (this.LLILLJJLI) {
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    } else {
                        iLIZIZ4 = 0;
                    }
                    C426750GoL.LJIIIZ(c127k, Integer.valueOf(iLIZIZ3), 0, Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ5), false, 16);
                    return;
                }
                anonymousClass1271.LL.LJ(false, false);
                C127K c127k2 = anonymousClass1271.LL;
                if (this.LLILLJJLI) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ = 0;
                }
                if (this.LLILLJJLI) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    iLIZIZ2 = 0;
                }
                C426750GoL.LJIIIZ(c127k2, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ2), 0, false, 16);
                return;
            }
            return;
        }
        if (itemViewType == 2 && (viewHolder instanceof AnonymousClass1273) && viewHolder != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 159), viewHolder.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder anonymousClass1271;
        if (i == 0) {
            anonymousClass1271 = new AnonymousClass1272(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f7e, viewGroup, false));
        } else if (i == 1) {
            anonymousClass1271 = new AnonymousClass1271(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f7g, viewGroup, false));
        } else if (i == 2) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f7f, viewGroup, false);
            anonymousClass1271 = new RecyclerView.ViewHolder(viewTd) { // from class: X.1273
            };
        } else {
            throw new IllegalStateException("Unknown view type");
        }
        try {
            View view = anonymousClass1271.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        anonymousClass1271.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (anonymousClass1271.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(anonymousClass1271.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) anonymousClass1271.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(anonymousClass1271.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = anonymousClass1271.getClass().getName();
        return anonymousClass1271;
    }
}
