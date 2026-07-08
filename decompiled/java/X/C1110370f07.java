package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110370f07 extends AbstractC1110480f0I<String, EmoteModel> {
    public final C1110380f08 LIZ;

    public C1110370f07(C1110380f08 c1110380f08) {
        this.LIZ = c1110380f08;
    }

    public final List<SpannableStringBuilder> LIZ(List<? extends EmoteModel> list, EnumC1110450f0F enumC1110450f0F, final Function1<? super EmoteModel, Unit> function1, LifecycleOwner lifecycleOwner, Function1<? super List<? extends SpannableStringBuilder>, Unit> function12, HashMap<String, EmoteModel> map) {
        EmoteModel emoteModel;
        if (function12 != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (EmoteModel emoteModel2 : list) {
                if (!map.containsKey(emoteModel2.emoteId) || (emoteModel = map.get(emoteModel2.emoteId)) == null || emoteModel.emoteResource == null) {
                    ArrayList<C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>> arrayList = C1110390f09.LJIIIZ;
                    if (!arrayList.isEmpty()) {
                        arrayList = C1110390f09.LJIIL;
                    }
                    arrayList.add(new C1110410f0B<>(new WeakReference(function12), enumC1110450f0F, list, lifecycleOwner));
                }
            }
        }
        C1110440f0E c1110440f0E = C1110390f09.LJI;
        int i = c1110440f0E.LIZIZ.get(enumC1110450f0F.ordinal());
        int i2 = c1110440f0E.LIZJ.get(enumC1110450f0F.ordinal());
        ArrayList arrayList2 = new ArrayList();
        Map<EmoteModel, Drawable> mapLIZ = this.LIZ.LIZ(list, enumC1110450f0F, null, lifecycleOwner, map);
        for (final EmoteModel emoteModel3 : list) {
            final Drawable drawable = (Drawable) ((HashMap) mapLIZ).get(emoteModel3);
            if (drawable != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((char) 65532);
                C416770GVv c416770GVv = new C416770GVv(drawable);
                c416770GVv.LIZIZ(i2);
                c416770GVv.LLILLL = i;
                c416770GVv.LLILZ = i;
                c416770GVv.LL = i;
                c416770GVv.LLILLJJLI = i;
                C786410Ut5.q2(spannableStringBuilder, c416770GVv, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                C786410Ut5.q2(spannableStringBuilder, new AbstractC1098790ehR(drawable, function1, emoteModel3) { // from class: X.0f04
                    public final /* synthetic */ Function1<EmoteModel, Unit> LLILZIL;
                    public final /* synthetic */ EmoteModel LLILZLL;

                    @Override // X.AbstractC431510Gw1
                    public final void LIZ() {
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                    }

                    @Override // X.AbstractC1098790ehR
                    public final void LIZIZ(View view) {
                        Function1<EmoteModel, Unit> function13 = this.LLILZIL;
                        EmoteModel emoteModel4 = this.LLILZLL;
                        if (function13 != null) {
                            function13.invoke(emoteModel4);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LLILZIL = function1;
                        this.LLILZLL = emoteModel3;
                    }
                }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                arrayList2.add(spannableStringBuilder);
            }
        }
        if (function12 != null) {
            function12.invoke(arrayList2);
            C1110390f09 c1110390f09 = C1110390f09.LIZ;
        }
        return arrayList2;
    }
}
