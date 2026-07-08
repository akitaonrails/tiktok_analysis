package X;

import Y.ACListenerS51S0101000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SOPBriefInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K1L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1L extends AbstractC21673619ry<C0K1O> {
    public final C0K1V LL;
    public final List<C0K1K> LLILLJJLI;
    public final Long LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public static final void LLLFZ(ImageView imageView, ImageModel imageModel) {
        C511420K3w.LJIIJ.getClass();
        C511420K3w c511420K3w = new C511420K3w();
        c511420K3w.LIZ = imageModel;
        c511420K3w.LIZ(imageView);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String string;
        String str2;
        boolean z;
        boolean z2;
        int i2;
        ImageModel imageModel;
        C0K1O c0k1o = (C0K1O) viewHolder;
        C0K1K c0k1k = (C0K1K) ListProtector.get(this.LLILLJJLI, i);
        View view = c0k1o.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) C511520K4g.LIZ(c0k1k.LIZJ);
            layoutParams.height = (int) C511520K4g.LIZ(c0k1k.LIZLLL);
            C786410Ut5.W5(view, layoutParams);
            c0k1o.LLILZIL.setBackground(C510570K0p.LIZ(C511520K4g.LIZ(6.0f), 0, C426930God.LIZ(R.attr.f_v, c0k1o.itemView.getContext()), (int) C511520K4g.LIZ(0.5f)));
            SOPBriefInfo sOPBriefInfo = c0k1k.LIZIZ;
            C510700K1c c510700K1c = new Object() { // from class: X.0K1c
            };
            if (sOPBriefInfo != null && sOPBriefInfo.awemeType == 150) {
                str = "photo";
            } else {
                str = "video";
            }
            Long l = this.LLILLL;
            if (l != null) {
                string = l.toString();
            } else {
                string = null;
            }
            if (sOPBriefInfo != null) {
                str2 = sOPBriefInfo.awemeId;
            } else {
                str2 = null;
            }
            String strValueOf = String.valueOf(str2);
            if (sOPBriefInfo != null && sOPBriefInfo.lockInfo == 2) {
                z = true;
            } else {
                z = false;
            }
            c510700K1c.getClass();
            C1973307oB c1973307oB = C1973307oB.LIZ;
            C1973407oC c1973407oC = new C1973407oC("subscription_perks_sub_only_video_cover_show");
            LinkedHashMap linkedHashMap = (LinkedHashMap) C1973307oB.LIZ();
            Object obj = linkedHashMap.get("enter_from_merge");
            if (obj == null) {
                obj = "";
            }
            c1973407oC.LIZ(obj, "enter_from_merge");
            Object obj2 = linkedHashMap.get("enter_method");
            if (obj2 == null) {
                obj2 = "";
            }
            c1973407oC.LIZ(obj2, "enter_method");
            Object obj3 = linkedHashMap.get("request_id");
            if (obj3 == null) {
                obj3 = "";
            }
            c1973407oC.LIZ(obj3, "request_id");
            Object obj4 = linkedHashMap.get("video_id");
            if (obj4 == null) {
                obj4 = "";
            }
            c1973407oC.LIZ(obj4, "video_id");
            c1973407oC.LIZ(str, "content_type");
            c1973407oC.LIZ(string, "author_id");
            c1973407oC.LIZ(strValueOf, "item_id");
            c1973407oC.LIZ(Integer.valueOf(Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE) ? 1 : 0), "if_preview");
            c1973407oC.LIZ("privilege_page", "enter_from");
            c1973407oC.LIZ(0, "if_subscribed");
            c1973407oC.LIZJ();
            TuxIconView tuxIconView = c0k1o.LLILZLL;
            SOPBriefInfo sOPBriefInfo2 = c0k1k.LIZIZ;
            if (sOPBriefInfo2 != null && sOPBriefInfo2.awemeType == 150) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxIconView);
            if (C0K7G.LJFF("sov_consumption_cover_list_picker_feature_toggle_enabled", true)) {
                c0k1o.itemView.setClickable(true);
                C786410Ut5.I7(new ACListenerS51S0101000_7(i, this, 0), c0k1o.itemView);
            }
            SOPBriefInfo sOPBriefInfo3 = c0k1k.LIZIZ;
            if (sOPBriefInfo3 != null) {
                ImageView imageView = c0k1o.LL;
                View view2 = c0k1o.LLILLJJLI;
                ImageView imageView2 = c0k1o.LLILZ;
                TuxTag tuxTag = c0k1o.LLILLL;
                SOVMaskInfo sOVMaskInfo = sOPBriefInfo3.maskInfo;
                if (sOVMaskInfo != null && sOVMaskInfo.type == 1) {
                    C511430K3x.LIZ.getClass();
                    C511430K3x.LIZLLL(imageView, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
                    LLLI(view2, imageView2, tuxTag);
                    return;
                }
                int i3 = sOPBriefInfo3.lockInfo;
                if (i3 == 1) {
                    LLLFZ(imageView, sOPBriefInfo3.cover);
                    LLLI(view2, imageView2, tuxTag);
                    return;
                } else {
                    if (i3 == 2) {
                        LLLFZ(imageView, sOPBriefInfo3.cover);
                        C786410Ut5.LJLLLLLL(8, view2);
                        C786410Ut5.LJLLLLLL(8, imageView2);
                        C786410Ut5.LJLLLLLL(0, tuxTag);
                        return;
                    }
                    LLLFZ(imageView, sOPBriefInfo3.cover);
                    C786410Ut5.LJLLLLLL(8, view2);
                    C786410Ut5.LJLLLLLL(8, imageView2);
                    C786410Ut5.LJLLLLLL(8, tuxTag);
                    return;
                }
            }
            SOVBriefInfo sOVBriefInfo = c0k1k.LIZ;
            ImageView imageView3 = c0k1o.LL;
            View view3 = c0k1o.LLILLJJLI;
            ImageView imageView4 = c0k1o.LLILZ;
            TuxTag tuxTag2 = c0k1o.LLILLL;
            if (sOVBriefInfo != null) {
                SOVMaskInfo sOVMaskInfo2 = sOVBriefInfo.maskInfo;
                if (sOVMaskInfo2 != null && sOVMaskInfo2.type == 1) {
                    C511430K3x.LIZ.getClass();
                    C511430K3x.LIZLLL(imageView3, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
                    LLLI(view3, imageView4, tuxTag2);
                    return;
                } else if (sOVBriefInfo.lockInfo == 1) {
                    LLLFZ(imageView3, sOVBriefInfo.cover);
                    LLLI(view3, imageView4, tuxTag2);
                    return;
                } else {
                    if (sOVBriefInfo.lockInfo == 2) {
                        LLLFZ(imageView3, sOVBriefInfo.cover);
                        C786410Ut5.LJLLLLLL(8, view3);
                        C786410Ut5.LJLLLLLL(8, imageView4);
                        C786410Ut5.LJLLLLLL(0, tuxTag2);
                        return;
                    }
                    imageModel = sOVBriefInfo.cover;
                }
            } else {
                imageModel = null;
            }
            LLLFZ(imageView3, imageModel);
            C786410Ut5.LJLLLLLL(8, view3);
            C786410Ut5.LJLLLLLL(8, imageView4);
            C786410Ut5.LJLLLLLL(8, tuxTag2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0K1O c0k1o = new C0K1O(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fgt, viewGroup, false));
        try {
            View view = c0k1o.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0k1o.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0k1o.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0K1O.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0k1o.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0k1o.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0K1O.class.getName();
        return c0k1o;
    }

    public C0K1L(C0K1J c0k1j, List list, Long l) {
        this.LL = c0k1j;
        this.LLILLJJLI = list;
        this.LLILLL = l;
    }

    public static final void LLLI(View view, ImageView imageView, TextView textView) {
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.LJLLLLLL(0, imageView);
        C786410Ut5.LJLLLLLL(8, textView);
    }
}
