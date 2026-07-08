package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065720dq6 extends AbstractC1255880imo<Aweme, FeedsResponse> {
    public static final /* synthetic */ int LLILZ = 0;
    public final String LL;
    public final InterfaceC1065730dq7 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return ((FeedsResponse) this.mData).list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((FeedsResponse) t).hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(List<? extends Object> list) {
        if (((FeedsResponse) this.mData).list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Object> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ListProtector.get(((FeedsResponse) this.mData).list, ((Integer) it2.next()).intValue()));
        }
        ((FeedsResponse) this.mData).list.removeAll(arrayList);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIL(boolean z) throws JSONException {
        InterfaceC1065730dq7 interfaceC1065730dq7 = this.LLILLJJLI;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page", this.LLILLL + 1);
        jSONObject2.put("react_id", this.LL);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "load_feeds_more");
        interfaceC1065730dq7.sendStatus("notification", jSONObject, 3);
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) throws JSONException {
        LJIIL(false);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) throws JSONException {
        LJIIL(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1065720dq6(FeedsResponse feedsResponse, String str, InterfaceC1065730dq7 interfaceC1065730dq7) {
        this.LL = str;
        this.LLILLJJLI = interfaceC1065730dq7;
        this.mData = feedsResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(int i, boolean z, boolean z2, List list) {
        if (list.isEmpty()) {
            this.mIsLoading = false;
            List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
            if (list2 != null) {
                for (InterfaceC1526205yG interfaceC1526205yG : list2) {
                    if (interfaceC1526205yG != null) {
                        interfaceC1526205yG.onFailed(new Exception());
                    }
                }
                return;
            }
            return;
        }
        this.LLILLL = i;
        FeedsResponse data = getData();
        if (data != null) {
            this.mIsNewDataEmpty = data.list.isEmpty();
            T t = this.mData;
            ((FeedsResponse) t).hasMore = z;
            if (z2) {
                ((FeedsResponse) t).list.addAll(0, list);
            } else {
                ((FeedsResponse) t).list.addAll(list);
            }
        }
        this.mIsLoading = false;
        List<InterfaceC1526205yG> list3 = this.mNotifyListeners;
        if (list3 != null) {
            for (InterfaceC1526205yG interfaceC1526205yG2 : list3) {
                if (interfaceC1526205yG2 != null) {
                    interfaceC1526205yG2.onSuccess();
                }
            }
        }
    }
}
