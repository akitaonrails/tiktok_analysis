package X;

import X.C19269910a9;
import X.C19270210aC;
import Y.ACListenerS130S0200000_28;
import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import mf.a;

/* JADX INFO: renamed from: X.10aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19270210aC extends AbstractC21673619ry<RecyclerView.ViewHolder> implements LifecycleOwner, InterfaceC19270010aA {
    public final Activity LL;
    public ArrayList<ContentLanguage> LLILLJJLI = new ArrayList<>();
    public final ContentPreferenceViewModel LLILLL;
    public final C19269910a9 LLILZ;

    @Override // X.InterfaceC19270010aA
    public final void Fa2(Throwable th) {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.InterfaceC19270010aA
    public final void A() {
        int size = this.LLILLL.wQ2().getValue().size();
        String strLIZIZ = "";
        for (int i = 0; i < size; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(((ContentLanguage) ListProtector.get(this.LLILLL.wQ2().getValue(), i)).getLanguageCode());
            sbLIZ.append(',');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        SharePrefCache.inst().getUserAddLanguages().LJ(strLIZIZ);
        ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LJIIIIZZ();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        ArrayList<ContentLanguage> arrayList = this.LLILLJJLI;
        return (arrayList != null ? Integer.valueOf(arrayList.size()).intValue() : 0) + 1;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return ((LifecycleOwner) this.LL).getLifecycle();
    }

    public C19270210aC(C19EG c19eg) {
        this.LL = c19eg;
        ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) ViewModelProviders.of(c19eg).get(ContentPreferenceViewModel.class);
        this.LLILLL = contentPreferenceViewModel;
        contentPreferenceViewModel.wQ2().observe(this, new AObserverS230S0100000_28(this, 118));
        C19269910a9 c19269910a9 = new C19269910a9();
        this.LLILZ = c19269910a9;
        c19269910a9.LIZJ = this;
        if (c19eg instanceof LifecycleOwner) {
            c19eg.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.contentlanguage.ContentLanguageAdapter$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        onResume();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    C19269910a9 c19269910a92 = this.LL.LLILZ;
                    if (c19269910a92 != null) {
                        c19269910a92.LIZ.LJ();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    C19270210aC c19270210aC = this.LL;
                    ContentPreferenceViewModel contentPreferenceViewModel2 = c19270210aC.LLILLL;
                    if (contentPreferenceViewModel2 != null) {
                        c19270210aC.LLILLJJLI = contentPreferenceViewModel2.wQ2().getValue();
                        this.LL.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemCount() != 1 && (viewHolder instanceof C19270310aD)) {
            ContentLanguage contentLanguage = (ContentLanguage) ListProtector.get(this.LLILLJJLI, i - 1);
            if (contentLanguage.getLocalName() == null) {
                return;
            }
            C19270310aD c19270310aD = (C19270310aD) viewHolder;
            c19270310aD.LL.setTitle(contentLanguage.getLocalName());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_trash_bin;
            c19270310aD.LL.setIcon(c419910GdJ);
            C127K c127k = c19270310aD.LL;
            View.OnClickListener aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(this, contentLanguage, 75);
            if (C1848410yCV.LIZ) {
                aCListenerS130S0200000_28 = new f(aCListenerS130S0200000_28);
            }
            a aVar = new a(aCListenerS130S0200000_28);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c127k);
            }
            c127k.setOnClickListener(aVar);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19270310aD;
        if (i == 0) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d17, viewGroup, false);
            c19270310aD = new RecyclerView.ViewHolder(viewTd) { // from class: X.10aE
            };
        } else {
            c19270310aD = new C19270310aD(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cuf, viewGroup, false));
        }
        try {
            View view = c19270310aD.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19270310aD.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19270310aD.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19270310aD.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19270310aD.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19270310aD.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19270310aD.getClass().getName();
        return c19270310aD;
    }
}
