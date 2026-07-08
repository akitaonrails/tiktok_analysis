package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0DQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment$onViewCreated$7$2$1", f = "TakoVideoPlayerFragment.kt", l = {423}, m = "invokeSuspend")
public final class C0DQ7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C197039127h LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ TakoVideoPlayerFragment LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DQ7(C197039127h c197039127h, View view, String str, String str2, TakoVideoPlayerFragment takoVideoPlayerFragment, InterfaceC1364105Vn<? super C0DQ7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c197039127h;
        this.LLILLL = view;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = takoVideoPlayerFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DQ7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        Map<String, String> map;
        String str2;
        Map<String, String> map2;
        C1C7U.LIZ("TakoVideoPlayerFragment@7513.onViewCreated$7$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        List<String> list = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Context context = this.LLILLJJLI.getContext();
            View view = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TakoVideoPlayerFragment takoVideoPlayerFragment = this.LLILZLL;
            String str5 = this.LLILZIL;
            C1845270y7R c1845270y7R = takoVideoPlayerFragment.LLIZLLLIL;
            if (c1845270y7R != null && (map = c1845270y7R.params) != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("media_type", "video");
            linkedHashMap.put("url", str5);
            C1845270y7R c1845270y7R2 = takoVideoPlayerFragment.LLIZLLLIL;
            if (c1845270y7R2 != null) {
                str = c1845270y7R2.msgId;
            } else {
                str = null;
            }
            linkedHashMap.put("message_id", str);
            linkedHashMap.put("source", "post_panel");
            this.LL = 1;
            obj = C12FM.LIZIZ(context, view, str3, str4, linkedHashMap, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoVideoPlayerFragment@7513.onViewCreated$7$2$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str6 = (String) pair.getSecond();
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            this.LLILZLL.t4(false);
        } else {
            TakoVideoPlayerFragment takoVideoPlayerFragment2 = this.LLILZLL;
            C197039127h c197039127h = this.LLILLJJLI;
            takoVideoPlayerFragment2.getClass();
            c197039127h.setLoading(false);
        }
        if (zBooleanValue && C123100dR.LIZ(str6)) {
            Context context2 = this.LLILLJJLI.getContext();
            C1845270y7R c1845270y7R3 = this.LLILZLL.LLIZLLLIL;
            if (c1845270y7R3 != null) {
                str2 = c1845270y7R3.msgId;
                map2 = c1845270y7R3.params;
                list = c1845270y7R3.hashTags;
            } else {
                str2 = null;
                map2 = null;
            }
            C12FM.LIZ(context2, str6, str2, map2, list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoPlayerFragment@7513.onViewCreated$7$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
