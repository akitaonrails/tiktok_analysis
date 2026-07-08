package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L69, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L69 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final ArrayList<LiveSubMediaModel> LL;
    public int LLILLJJLI;
    public int LLILLL;
    public PreviewImageDialogFragment LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0L69() {
        this.LL = new ArrayList<>();
        this.LLILLJJLI = -1;
    }

    public C0L69(Integer num) {
        this();
    }

    public final Integer LLLFZ(LiveSubMediaModel liveSubMediaModel) {
        int i = this.LLILLL;
        this.LLILLL = this.LL.indexOf(liveSubMediaModel);
        if (i > -1 && i < getItemCount()) {
            notifyItemChanged(i, "previewBorder");
        }
        int i2 = this.LLILLL;
        if (i2 > -1 && i2 < getItemCount()) {
            notifyItemChanged(this.LLILLL, "previewBorder");
            return Integer.valueOf(this.LLILLL);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [REQUEST, X.0kbR] */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        InterfaceC1320850kTb controller;
        C0L6A c0l6a = (C0L6A) viewHolder;
        final LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) ListProtector.get(this.LL, i);
        if (liveSubMediaModel != null) {
            C0L69 c0l69 = c0l6a.LLILZLL;
            Uri uriLIZ = C010V.LIZ(liveSubMediaModel.getFileLocalUriPath());
            c0l69.getClass();
            if (uriLIZ == null) {
                uriLIZ = UriProtector.parse("file://");
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uriLIZ);
            c1325700kbQLIZLLL.LIZJ = new C1324630kZh((int) C497740JfY.LIZIZ(56.0f), (int) C497740JfY.LIZIZ(56.0f));
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            C1322110kVd c1322110kVd = c0l6a.LLILLJJLI;
            if (c1322110kVd != null) {
                controller = c1322110kVd.getController();
            } else {
                controller = null;
            }
            c1320810kTXLIZJ.LJIILJJIL = controller;
            c1320810kTXLIZJ.LIZLLL = LIZ;
            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
            C1322110kVd c1322110kVd2 = c0l6a.LLILLJJLI;
            if (c1322110kVd2 != null) {
                c1322110kVd2.setController(abstractC1320710kTNLIZ);
            }
            c0l6a.I5(liveSubMediaModel, i);
        }
        View view = c0l6a.LLILLL;
        final C0L69 c0l692 = c0l6a.LLILZLL;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0L6E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Map<String, Object> map;
                C0L69 c0l693 = this.LL;
                LiveSubMediaModel liveSubMediaModel2 = liveSubMediaModel;
                if (liveSubMediaModel2 == null) {
                    c0l693.getClass();
                } else {
                    int size = c0l693.LL.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (Intrinsics.LJFF(((LiveSubMediaModel) ListProtector.get(c0l693.LL, i2)).getFileLocalUriPath(), liveSubMediaModel2.getFileLocalUriPath())) {
                            if (i2 != -1) {
                                c0l693.notifyItemRemoved(i2);
                                c0l693.LL.remove(liveSubMediaModel2);
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                PreviewImageDialogFragment previewImageDialogFragment = this.LL.LLILZ;
                if (previewImageDialogFragment != null) {
                    LiveSubMediaModel liveSubMediaModel3 = liveSubMediaModel;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emote_preedit_page_delete");
                    C523330Kfj c523330Kfj = previewImageDialogFragment.LLIZ;
                    if (c523330Kfj != null && (map = c523330Kfj.LJ) != null) {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
                        }
                    }
                    c474500IjALIZ.LIZ();
                    ((ArrayList) previewImageDialogFragment.LLILZLL).clear();
                    ((ArrayList) previewImageDialogFragment.LLILZLL).addAll(previewImageDialogFragment.LLJI.LL);
                    previewImageDialogFragment.LLJ.setData(previewImageDialogFragment.LLILZLL);
                    if (Intrinsics.LJFF(previewImageDialogFragment.LLIZLLLIL, liveSubMediaModel3)) {
                        LiveSubMediaModel liveSubMediaModel4 = (LiveSubMediaModel) C13LP.LJJJLZIJ(previewImageDialogFragment.NR().getCurrentItem(), previewImageDialogFragment.LLILZLL);
                        if (liveSubMediaModel4 != null) {
                            previewImageDialogFragment.LLIZLLLIL = liveSubMediaModel4;
                            previewImageDialogFragment.LLJI.LLLFZ(liveSubMediaModel4);
                        }
                    } else if (((ArrayList) previewImageDialogFragment.LLILZLL).size() == 1) {
                        previewImageDialogFragment.LLJI.notifyItemChanged(0);
                    } else {
                        previewImageDialogFragment.MR(previewImageDialogFragment.LLIZLLLIL);
                    }
                    if (((ArrayList) previewImageDialogFragment.LLILZLL).size() == 0) {
                        previewImageDialogFragment.LLIZLLLIL = null;
                    }
                }
            }
        }, view);
        FrameLayout frameLayout = c0l6a.LLILZ;
        if (frameLayout != null) {
            final C0L69 c0l693 = c0l6a.LLILZLL;
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0L6B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PreviewImageDialogFragment previewImageDialogFragment = this.LL.LLILZ;
                    if (previewImageDialogFragment != null) {
                        previewImageDialogFragment.MR(liveSubMediaModel);
                    }
                }
            });
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0L6A c0l6a = new C0L6A(this, viewGroup);
        try {
            View view = c0l6a.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0l6a.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0l6a.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0L6A.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0l6a.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0l6a.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0L6A.class.getName();
        return c0l6a;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
        } else {
            ((C0L6A) viewHolder).I5((LiveSubMediaModel) ListProtector.get(this.LL, i), i);
        }
    }
}
