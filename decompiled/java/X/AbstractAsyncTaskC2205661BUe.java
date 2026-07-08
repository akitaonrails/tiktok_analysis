package X;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractAsyncTaskC2205661BUe extends AbstractAsyncTaskC2205651BUd {
    public final HashSet<String> LIZJ;
    public final JSONObject LIZLLL;
    public final long LJ;

    public AbstractAsyncTaskC2205661BUe(C2205721BUk c2205721BUk, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c2205721BUk);
        this.LIZJ = new HashSet<>(hashSet);
        this.LIZLLL = jSONObject;
        this.LJ = j;
    }

    @Override // X.AbstractAsyncTaskC2205651BUd, android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}
