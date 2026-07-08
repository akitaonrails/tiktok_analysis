package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.setting.MessageReactionV2EmojiSetSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456160Hug extends AbstractC21673619ry<C424350GkT> {
    public List<C459160HzW> LL;
    public final double LLILLJJLI;
    public InterfaceC455400HtS LLILLL;
    public List<C456180Hui> LLILZ = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public static final List<String> LLLI() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel messageReactionV2EmojiSetModel = MessageReactionV2EmojiSetSettings.LIZ;
        MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel messageReactionV2EmojiSetModel2 = (MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel) settingsManagerLIZLLL.LJIIIIZZ("message_reaction_v2_emoji_set", MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel.class, messageReactionV2EmojiSetModel);
        if (messageReactionV2EmojiSetModel2 != null) {
            messageReactionV2EmojiSetModel = messageReactionV2EmojiSetModel2;
        }
        List<String> listLJIIJJI = messageReactionV2EmojiSetModel.reactionEmojiSetV5;
        if (listLJIIJJI == null) {
            listLJIIJJI = C1697810uHb.LJIIJJI("❤️", "😂", "😭", "👍", "😡", "🤔", "😳", "😱", "🤗", "🙈", "🤪", "🎉");
        }
        C1917907fF c1917907fF = (C1917907fF) ((AbstractC2202061BGi) C452590Hov.LIZ.getValue()).getUserScopeObject();
        List<String> listLIZ = c1917907fF != null ? c1917907fF.LIZ() : C13BV.INSTANCE;
        return !listLIZ.isEmpty() ? C13LP.LJLIL(C13LP.LJLI(listLJIIJJI, C13LP.LLIIJI(listLIZ)), listLIZ) : listLJIIJJI;
    }

    public final C456180Hui LLLFZ(String str) {
        boolean z;
        List<C459160HzW> list = this.LL;
        ArrayList arrayList = new ArrayList();
        Iterator<C459160HzW> it2 = list.iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            C459160HzW next = it2.next();
            if (true ^ next.LIZIZ.isBot()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((C459160HzW) it3.next()).LIZ, str)) {
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return new C456180Hui(str, z, EnumC879260YeS.HUMAN);
    }

    public final void LLLIIIIL(boolean z) {
        final ArrayList arrayList;
        if (!z && !this.LLILZ.isEmpty()) {
            List<C456180Hui> list = this.LLILZ;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C456180Hui> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LLLFZ(it2.next().LIZ));
            }
        } else {
            List<String> listLLLI = LLLI();
            arrayList = new ArrayList(C15438062q.LJIJJ(listLLLI, 10));
            Iterator<String> it3 = listLLLI.iterator();
            while (it3.hasNext()) {
                arrayList.add(LLLFZ(it3.next()));
            }
        }
        final List<C456180Hui> list2 = this.LLILZ;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list2, arrayList) { // from class: X.0Huh
            public final List<C456180Hui> LIZ;
            public final List<C456180Hui> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            {
                this.LIZ = list2;
                this.LIZIZ = arrayList;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                C456180Hui c456180Hui;
                C456180Hui c456180Hui2 = (C456180Hui) C13LP.LJJJLZIJ(i, this.LIZ);
                if (c456180Hui2 == null || (c456180Hui = (C456180Hui) C13LP.LJJJLZIJ(i2, this.LIZIZ)) == null || c456180Hui2.LIZIZ != c456180Hui.LIZIZ) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                C456180Hui c456180Hui;
                C456180Hui c456180Hui2 = (C456180Hui) C13LP.LJJJLZIJ(i, this.LIZ);
                if (c456180Hui2 == null || (c456180Hui = (C456180Hui) C13LP.LJJJLZIJ(i2, this.LIZIZ)) == null || !Intrinsics.LJFF(c456180Hui2.LIZ, c456180Hui.LIZ) || c456180Hui2.LIZJ != c456180Hui.LIZJ) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                C456180Hui c456180Hui = (C456180Hui) C13LP.LJJJLZIJ(i2, this.LIZIZ);
                if (c456180Hui == null) {
                    return null;
                }
                return new C456190Huj(c456180Hui.LIZIZ);
            }
        }, true);
        this.LLILZ = arrayList;
        c21341918fZLIZ.LIZJ(this);
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLII, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C424350GkT c424350GkT, int i) {
        C456180Hui c456180Hui = (C456180Hui) C13LP.LJJJLZIJ(i, this.LLILZ);
        if (c456180Hui == null) {
            return;
        }
        String str = c456180Hui.LIZ;
        c424350GkT.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan() { // from class: X.0GWd
            @Override // android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                return (int) paint.measureText(charSequence.subSequence(i2, i3).toString());
            }

            @Override // android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i2, i3);
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                canvas.drawText(charSequenceSubSequence.toString(), f, i5 - (((((fontMetricsInt.descent + i5) + i5) + fontMetricsInt.ascent) / 2.0f) - ((i6 + i4) / 2.0f)), paint);
            }
        }, 0, str.length(), 33);
        c424350GkT.LLILLJJLI.setText(spannableStringBuilder.toString());
        c424350GkT.LLILLL = str;
        c424350GkT.I5(c456180Hui.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0HuO] */
    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(C341940Daq.LIZ(this.LLILLJJLI), C341940Daq.LIZ(this.LLILLJJLI)));
        tuxTextView.setTextAlignment(4);
        tuxTextView.setGravity(17);
        tuxTextView.LJJJJI(28.0f);
        C424350GkT c424350GkT = new C424350GkT(tuxTextView, new InterfaceC455400HtS() { // from class: X.0HuO
            @Override // X.InterfaceC455400HtS
            public final void LIZ(InterfaceC879330YeZ interfaceC879330YeZ) {
                this.LIZ.LLILLL.LIZ(interfaceC879330YeZ);
            }
        });
        try {
            View view = c424350GkT.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c424350GkT.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c424350GkT.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C424350GkT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c424350GkT.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c424350GkT.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C424350GkT.class.getName();
        return c424350GkT;
    }

    public C456160Hug(C13BV c13bv, double d, InterfaceC455400HtS interfaceC455400HtS) {
        this.LL = c13bv;
        this.LLILLJJLI = d;
        this.LLILLL = interfaceC455400HtS;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C424350GkT c424350GkT = (C424350GkT) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(c424350GkT, i);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof C456190Huj) {
                c424350GkT.I5(((C456190Huj) obj).LIZ);
            }
        }
    }
}
