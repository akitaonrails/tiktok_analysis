package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.080g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20472080g implements Serializable {
    public String jsonString;
    public List<String> wordList;

    public C20472080g() {
        this(null, null);
    }

    public final String getJsonString() {
        List<String> list = this.wordList;
        return (list == null || list.isEmpty()) ? "" : GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.wordList);
    }

    public final String getKeyWord() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.wordList;
        if (list != null) {
            for (String str : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(' ');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return a0.LJLIIIL(sb).toString();
    }

    public final boolean isVisible() {
        List<String> list = this.wordList;
        return list != null && Integer.valueOf(list.size()).intValue() > 1;
    }

    public final void removeAllWords() {
        List<String> list = this.wordList;
        if (list != null) {
            list.clear();
        }
        this.jsonString = getJsonString();
    }

    public final boolean isLastWord(int i) {
        int size;
        List<String> list = this.wordList;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (i != size - 1) {
            return false;
        }
        return true;
    }

    public final void removeWord(int i) {
        List<String> list = this.wordList;
        if (list != null) {
            ListProtector.remove(list, i);
        }
        this.jsonString = getJsonString();
    }

    public final void setWordList(List<String> list) {
        this.wordList = list;
    }

    public C20472080g(String str, List<String> list) {
        Object c098200Yq;
        this.jsonString = str;
        this.wordList = list;
        if (str != null) {
            try {
                c098200Yq = (List) C7740030o.LIZ().getGson().LJIIIIZZ(str, new TypeToken<List<String>>() { // from class: X.080h
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            List<String> list2 = (List) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            this.wordList = list2;
            Objects.toString(list2);
        }
    }
}
