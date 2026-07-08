package X;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380110EvJ extends AbstractC21673619ry<C380130EvL> {
    public final Context LL;
    public final C380120EvK LLILLJJLI;
    public Integer LLILZLL;
    public List<EditorProAIGCMediaItemModel> LLILLL = C13BV.INSTANCE;
    public String LLILZ = "";
    public EnumC378720Et4 LLILZIL = EnumC378720Et4.NONE;
    public final float LLIZ = 1.4556962f;
    public final float LLIZLLLIL = 1.5151515f;

    public final Size LLLI() {
        Float fLJIIIIZZ;
        Float fValueOf;
        if (this.LLILZ.length() <= 0) {
            return new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.LLILZ, new String[]{":"}, 0, 6);
        float fFloatValue = 0.8f;
        if (listLJJLIIIJILLIZJL.size() == 2 && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ((String) ListProtector.get(listLJJLIIIJILLIZJL, 0))) != null) {
            float fFloatValue2 = fLJIIIIZZ.floatValue();
            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            if (fLJIIIIZZ2 != null) {
                float fFloatValue3 = fLJIIIIZZ2.floatValue();
                if (fFloatValue2 > 0.0f && fFloatValue3 > 0.0f && (fValueOf = Float.valueOf(C13LZ.LIZLLL(fFloatValue2 / fFloatValue3, 0.8f, 1.2f))) != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
        }
        EnumC378720Et4 enumC378720Et4 = this.LLILZIL;
        EnumC378720Et4 enumC378720Et42 = EnumC378720Et4.TEXT_TO_IMAGE_RESULT;
        int i = enumC378720Et4 == enumC378720Et42 ? 4 : 3;
        int iLIZLLL = ((C418440Gaw.LIZLLL(this.LL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * (i - 1))) / i;
        float f = iLIZLLL;
        float f2 = f / fFloatValue;
        if (this.LLILZIL != enumC378720Et42 && ((Boolean) C273510Anl.LIZ.getValue()).booleanValue()) {
            return new Size(iLIZLLL, (int) f2);
        }
        int iLIZIZ = C814420VxA.LIZIZ(f * this.LLIZ);
        if (iLIZIZ < 1) {
            iLIZIZ = 1;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(f2 * this.LLIZLLLIL);
        return new Size(iLIZIZ, iLIZIZ2 >= 1 ? iLIZIZ2 : 1);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.isEmpty() ? this.LLILZIL == EnumC378720Et4.TEXT_TO_VIDEO_RESULT ? 1 : 4 : this.LLILLL.size();
    }

    public final void LLLFZ(int i) {
        C13LP.LJJJLZIJ(i, this.LLILLL);
        Integer num = this.LLILZLL;
        if (num != null) {
            notifyItemChanged(num.intValue(), 101);
        }
        this.LLILZLL = Integer.valueOf(i);
        notifyItemChanged(i, 101);
    }

    public C380110EvJ(Context context, C380120EvK c380120EvK) {
        this.LL = context;
        this.LLILLJJLI = c380120EvK;
    }

    public static void LLLIILIL(C380130EvL c380130EvL, boolean z) {
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus;
        boolean z2;
        c380130EvL.itemView.setSelected(z);
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = c380130EvL.LLIZLLLIL;
        if (editorProAIGCMediaItemModel != null) {
            editorProAIGCMediaItemModelStatus = editorProAIGCMediaItemModel.status;
        } else {
            editorProAIGCMediaItemModelStatus = null;
        }
        if (editorProAIGCMediaItemModelStatus == EditorProAIGCMediaItemModelStatus.COMPLETE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            C786410Ut5.LLLLLLZZ(c380130EvL.LLIZ, 0);
        } else {
            C786410Ut5.LLLLLLZZ(c380130EvL.LLIZ, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e9  */
    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLII, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C380130EvL r12, int r13) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380110EvJ.onBindViewHolder(X.0EvL, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bzb, viewGroup, false);
        SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.l2v);
        View viewFindViewById = viewTd.findViewById(R.id.l2z);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.l2x);
        C1295960jpS c1295960jpS = (C1295960jpS) viewTd.findViewById(R.id.l2y);
        View viewFindViewById2 = viewTd.findViewById(R.id.l32);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.l31);
        TuxIconView tuxIconView2 = (TuxIconView) viewTd.findViewById(R.id.l30);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zb);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(9));
        tuxIconView2.setBackground(c384050F3z.LIZ(viewTd.getContext()));
        C380130EvL c380130EvL = new C380130EvL(viewTd, smartImageView, viewFindViewById, tuxIconView, c1295960jpS, viewFindViewById2, tuxTextView, tuxIconView2);
        try {
            View view = c380130EvL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c380130EvL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c380130EvL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C380130EvL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c380130EvL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c380130EvL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C380130EvL.class.getName();
        return c380130EvL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        boolean z;
        C380130EvL c380130EvL = (C380130EvL) viewHolder;
        c380130EvL.LLIZLLLIL = (EditorProAIGCMediaItemModel) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (list.isEmpty()) {
            onBindViewHolder(c380130EvL, i);
            return;
        }
        for (Object obj : list) {
            boolean zIsEmpty = this.LLILLL.isEmpty();
            if (Intrinsics.LJFF(obj, 101)) {
                Integer num = this.LLILZLL;
                if (num != null && num.intValue() == i && !zIsEmpty) {
                    z = true;
                } else {
                    z = false;
                }
                LLLIILIL(c380130EvL, z);
            }
        }
    }

    public final void LLLIIIIL(boolean z, int i, int i2, boolean z2, boolean z3) {
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLZIJ(i, this.LLILLL);
        LLLFZ(i);
        MutableLiveData<C379670Eub> event = this.LLILLJJLI.getEvent();
        if (event != null) {
            event.setValue(new C379670Eub(editorProAIGCMediaItemModel, z, i2, z2, z3));
        }
    }
}
