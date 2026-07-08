package X;

import Y.ACListenerS109S0200000_5;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388980FMy {
    public static final C388980FMy LIZ = new C388980FMy();
    public static Pair<Integer, Integer> LIZIZ = new Pair<>(0, 0);

    public static void LIZ(final List list, final C388620FLo c388620FLo, final Function1 function1, final boolean z) {
        if (C426750GoL.LIZLLL(c388620FLo.getContext())) {
            c388620FLo.LIZJ(C1919207fS.LJIIIIZZ(), 0.0f);
        } else {
            c388620FLo.LIZJ(0.0f, C1919207fS.LJIIIIZZ());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c388620FLo.getContext());
        linearLayoutManager.setOrientation(0);
        c388620FLo.setLayoutManager(linearLayoutManager);
        LIZ.getClass();
        c388620FLo.setAdapter(new AbstractC21673619ry<C388750FMb>() { // from class: X.0FMa
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return list.size();
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C388750FMb c388750FMb = (C388750FMb) viewHolder;
                AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText = (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText) C13LP.LJJJLZIJ(i, list);
                if (addYoursAutoSuggestTopicForText != null && C123100dR.LIZ(addYoursAutoSuggestTopicForText.text)) {
                    C786410Ut5.LJLLLLLL(0, c388750FMb.itemView);
                    TuxTextView tuxTextView = c388750FMb.LL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(addYoursAutoSuggestTopicForText.text);
                    }
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                int i2;
                C388980FMy c388980FMy = C388980FMy.LIZ;
                RecyclerView recyclerView = c388620FLo;
                Function1<Integer, Unit> function12 = function1;
                boolean z2 = z;
                c388980FMy.getClass();
                Context context = recyclerView.getContext();
                LinearLayout linearLayout = new LinearLayout(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                linearLayout.setPadding(C1919207fS.LIZIZ(), C1919207fS.LJIIJJI(), C1919207fS.LIZIZ(), C1919207fS.LJIIJJI());
                layoutParams.gravity = 17;
                linearLayout.setOrientation(0);
                C786410Ut5.d6(linearLayout, layoutParams);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                linearLayout.setBackground(c384050F3z.LIZ(context));
                C388750FMb c388750FMb = new C388750FMb(linearLayout);
                if (z2) {
                    i2 = 0;
                    TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C1919207fS.LIZJ(), C1919207fS.LIZJ());
                    layoutParams2.gravity = 16;
                    C786410Ut5.M6(tuxIconView, layoutParams2);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_camera_plus_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    tuxIconView.setTuxIcon(c419910GdJ);
                    linearLayout.addView(tuxIconView);
                } else {
                    i2 = 0;
                }
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, i2);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
                if (z2) {
                    layoutParams3.setMarginStart(C1919207fS.LJIIIZ());
                }
                C786410Ut5.R6(tuxTextView, layoutParams3);
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColorRes(R.attr.ee);
                tuxTextView.setGravity(17);
                c388750FMb.LL = tuxTextView;
                linearLayout.addView(tuxTextView);
                C786410Ut5.R7(linearLayout, new ACListenerS109S0200000_5(function12, recyclerView, 3));
                try {
                    View view = c388750FMb.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c388750FMb.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c388750FMb.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C388750FMb.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c388750FMb.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c388750FMb.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C388750FMb.class.getName();
                return c388750FMb;
            }
        });
        c388620FLo.addItemDecoration(new C0DXR() { // from class: X.0FLh
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (C426750GoL.LIZLLL(c388620FLo.getContext())) {
                    rect.left = C1919207fS.LJIIJJI();
                    if (childAdapterPosition == 0) {
                        rect.right = C1919207fS.LIZIZ();
                        return;
                    }
                    return;
                }
                rect.right = C1919207fS.LJIIJJI();
                if (childAdapterPosition != 0) {
                    return;
                }
                rect.left = C1919207fS.LIZIZ();
            }
        });
    }

    public static C19614411oc LIZIZ(Context context, Integer num, boolean z, boolean z2, AddYoursStickerModel addYoursStickerModel, Function0 function0) {
        int iIntValue;
        int i;
        float f;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2131825072;
        }
        if (z) {
            i = R.raw.icon_two_person_large_fill;
        } else {
            i = R.raw.icon_camera_plus_fill;
        }
        boolean zIsCandidateState = addYoursStickerModel.isCandidateState();
        if (addYoursStickerModel.isCandidateState()) {
            f = 0.8f;
        } else {
            f = 1.0f;
        }
        return new C19614411oc(context, new C390690FTn(i, iIntValue, null, function0, f, false, z2, zIsCandidateState, 3136991));
    }
}
