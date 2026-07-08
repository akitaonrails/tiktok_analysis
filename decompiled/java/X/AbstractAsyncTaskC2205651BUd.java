package X;

import android.os.AsyncTask;

/* JADX INFO: renamed from: X.1BUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractAsyncTaskC2205651BUd extends AsyncTask<Object, Void, String> {
    public C2205681BUg LIZ;
    public final InterfaceC2205771BUp LIZIZ;

    public AbstractAsyncTaskC2205651BUd(InterfaceC2205771BUp interfaceC2205771BUp) {
        this.LIZIZ = interfaceC2205771BUp;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C2205681BUg c2205681BUg = this.LIZ;
        if (c2205681BUg != null) {
            c2205681BUg.LIZJ = null;
            AbstractAsyncTaskC2205651BUd abstractAsyncTaskC2205651BUdPoll = c2205681BUg.LIZIZ.poll();
            c2205681BUg.LIZJ = abstractAsyncTaskC2205651BUdPoll;
            if (abstractAsyncTaskC2205651BUdPoll != null) {
                C0WP3.LIZLLL(abstractAsyncTaskC2205651BUdPoll, c2205681BUg.LIZ, new Object[0]);
            }
        }
    }
}
