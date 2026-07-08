package X;

import Y.AComparatorS36S0000000_17;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS453S0200000_17;

/* JADX INFO: renamed from: X.0f0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110400f0A extends AbstractC1110480f0I<String, EmoteModel> {
    public final C1110370f07 LIZ;

    public C1110400f0A(C1110370f07 c1110370f07) {
        this.LIZ = c1110370f07;
    }

    public final SpannableStringBuilder LIZ(List<? extends EmoteWithIndex> list, EnumC1110450f0F enumC1110450f0F, String str, Resources resources, Function1<? super EmoteModel, Unit> function1, final Function0<Unit> function0, Function1<? super SpannableStringBuilder, Unit> function12, boolean z, LifecycleOwner lifecycleOwner, HashMap<String, EmoteModel> map, boolean z2) {
        int i;
        char c;
        String str2;
        ArrayList<C1110420f0C<String>> arrayList;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (list != null && !list.isEmpty()) {
            if (function12 != null && !list.isEmpty()) {
                for (EmoteWithIndex emoteWithIndex : list) {
                    EmoteModel emoteModel = emoteWithIndex.emoteModel;
                    String str3 = null;
                    if (emoteModel != null) {
                        str2 = emoteModel.emoteId;
                    } else {
                        str2 = null;
                    }
                    if (map.containsKey(str2)) {
                        EmoteModel emoteModel2 = emoteWithIndex.emoteModel;
                        if (emoteModel2 != null) {
                            str3 = emoteModel2.emoteId;
                        }
                        EmoteModel emoteModel3 = map.get(str3);
                        if (emoteModel3 == null || emoteModel3.emoteResource == null) {
                        }
                    }
                    C1110390f09 c1110390f09 = C1110390f09.LIZ;
                    if (!z) {
                        arrayList = C1110390f09.LJII;
                    } else {
                        arrayList = C1110390f09.LJIIJ;
                    }
                    arrayList.add(new C1110420f0C<>(new WeakReference(function12), enumC1110450f0F, list, lifecycleOwner, str, resources, new WeakReference(function1), new WeakReference(function0)));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (EmoteWithIndex emoteWithIndex2 : list) {
                if (emoteWithIndex2.emoteModel != null) {
                    arrayList2.add(emoteWithIndex2);
                }
            }
            List<EmoteWithIndex> listLJLLLL = C13LP.LJLLLL(new AComparatorS36S0000000_17(31), arrayList2);
            C1110370f07 c1110370f07 = this.LIZ;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = listLJLLLL.iterator();
            while (it2.hasNext()) {
                EmoteModel emoteModel4 = ((EmoteWithIndex) it2.next()).emoteModel;
                if (emoteModel4 != null) {
                    arrayList3.add(emoteModel4);
                }
            }
            List<SpannableStringBuilder> listLIZ = c1110370f07.LIZ(arrayList3, enumC1110450f0F, function1, lifecycleOwner, null, map);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (EmoteWithIndex emoteWithIndex3 : listLJLLLL) {
                int next = characterInstance.next((emoteWithIndex3.index - i2) - i3);
                if (next == -1) {
                    break;
                }
                linkedHashMap.put(emoteWithIndex3, Integer.valueOf(next + i4));
                i2 = emoteWithIndex3.index;
                i3 = 1;
                i4++;
            }
            int i5 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Number) entry.getValue()).intValue() >= 0 && ((Number) entry.getValue()).intValue() <= spannableStringBuilder.length()) {
                    spannableStringBuilder.insert(((Number) entry.getValue()).intValue(), (CharSequence) ListProtector.get(listLIZ, i5));
                    i5++;
                }
            }
        }
        if (spannableStringBuilder.length() > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (C1110390f09.LIZIZ) {
                c = 8207;
            } else {
                c = 8206;
            }
            spannableStringBuilder2.append(c);
            i = 0;
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        } else {
            i = 0;
        }
        if (function0 != null) {
            C786410Ut5.q2(spannableStringBuilder, new AbstractC1098790ehR() { // from class: X.0f0G
                @Override // X.AbstractC431510Gw1
                public final void LIZ() {
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    function0.invoke();
                }
            }, i, spannableStringBuilder.length(), 33);
        }
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        C1115380f8C.LIZLLL(spannableStringBuilder, resources, lifecycleOwner, new AwS453S0200000_17((Function1) function12, (Function1<? super SpannableStringBuilder, Unit>) spannableStringBuilder, (SpannableStringBuilder) 1));
        if (z2 && function12 != null) {
            function12.invoke(spannableStringBuilder);
            C1110390f09 c1110390f092 = C1110390f09.LIZ;
        }
        return spannableStringBuilder;
    }
}
