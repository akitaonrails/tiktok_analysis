package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.services.story.SimplePublishModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729340SjE extends C09AY implements Function1<List<? extends PublishModel>, Unit> {
    public final /* synthetic */ C729440SjO LL;
    public final /* synthetic */ String LLILLJJLI = null;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729340SjE(C729440SjO c729440SjO, AwS412S0200000_11 awS412S0200000_11) {
        super(1);
        this.LL = c729440SjO;
        this.LLILLL = awS412S0200000_11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends PublishModel> list) {
        Iterator it2;
        List<? extends PublishModel> list2 = list;
        this.LL.LLJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (list2.isEmpty()) {
            C729440SjO c729440SjO = this.LL;
            CopyOnWriteArrayList<Function1<List<C0SPF>, Unit>> copyOnWriteArrayList = c729440SjO.LL.LIZLLL.get(c729440SjO.LLJ);
            if (copyOnWriteArrayList != null) {
                Iterator<Function1<List<C0SPF>, Unit>> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().invoke(null);
                }
            }
        } else {
            String string = this.LLILLJJLI;
            if (string == null) {
                this.LL.getClass();
                C844470XAv.LIZ.getClass();
                string = C844470XAv.LIZ().getString(2131849116);
            }
            C729220Sj2.LL.getClass();
            C729440SjO c729440SjO2 = C729220Sj2.LJIIZILJ().LLILLJJLI;
            c729440SjO2.getClass();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends PublishModel> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList.add(SimplePublishModelKt.convert2SimplePublishModel(it4.next()));
            }
            c729440SjO2.LJIJI(arrayList, EnumC696090RSd.FAILED, string, new AwS590S0100000_11(c729440SjO2, 438));
            CopyOnWriteArrayList<Function1<List<C0SPF>, Unit>> copyOnWriteArrayList2 = c729440SjO2.LL.LIZLLL.get(c729440SjO2.LLJ);
            if (copyOnWriteArrayList2 != null) {
                Iterator<Function1<List<C0SPF>, Unit>> it5 = copyOnWriteArrayList2.iterator();
                while (it5.hasNext()) {
                    it5.next().invoke(c729440SjO2.LL.LIZJ);
                }
            }
            c729440SjO2.LL.LIZJ.size();
            Pair pair = new Pair(list2, null);
            List list3 = (List) pair.getFirst();
            List list4 = (List) pair.getSecond();
            this.LLILLL.invoke();
            if (list4 != null && !list4.isEmpty()) {
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(((PublishModel) it6.next()).creationId);
                    }
                    C729370SjH.LIZJ(new C5183020f((List) arrayList2, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 213));
                }
                if (list4 != null) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    Iterator it7 = list4.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(((PublishModel) it7.next()).creationId);
                    }
                    AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((List) arrayList3, (List<ActionBarButtonConfBusiness>) 522);
                    Set setLIZ = C729370SjH.LIZ();
                    if (setLIZ != null && (it2 = setLIZ.iterator()) != null) {
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (((Boolean) awS581S0100000_2.invoke(str)).booleanValue()) {
                                it2.remove();
                                C729370SjH.LIZIZ().erase(str);
                                Keva kevaLIZIZ = C729370SjH.LIZIZ();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str);
                                sbLIZ.append("_b");
                                kevaLIZIZ.erase(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        C729370SjH.LIZIZ().storeStringSet("key_unique_id_list", C729370SjH.LIZ());
                    }
                }
            } else {
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<? extends PublishModel> it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(it8.next().creationId);
                }
                C729370SjH.LIZJ(new C5183020f((List) arrayList4, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 212));
            }
        }
        return Unit.LIZ;
    }
}
