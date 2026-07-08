package X;

import android.content.ContentValues;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YBT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YBT extends C09AY implements Function0<C869530Y9f> {
    public final /* synthetic */ C0YBI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YBT(C0YBI c0ybi) {
        super(0);
        this.LL = c0ybi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Y9f] */
    @Override // kotlin.jvm.functions.Function0
    public final C869530Y9f invoke() {
        final C0YEM c0yem = this.LL.LIZ;
        return new C0Y9V(c0yem) { // from class: X.0Y9f
            public final C0YEM LIZIZ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0Y9V
            public final List LIZIZ() throws Throwable {
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMessageBodyList, limit: ");
                sbLIZ.append(20);
                C868780Y6i.LJ(c868780Y6iLIZLLL, "IMPendingMessageBodyDao", C2188811AlT.LIZIZ(sbLIZ), 4);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\n            SELECT * FROM pending_message_body pendingMsgBody\n            WHERE NOT EXISTS (\n                SELECT 1 \n                FROM msg msg \n                WHERE msg.");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                sbLIZ2.append(" = pendingMsgBody.");
                sbLIZ2.append(EnumC869540Y9g.COLUMN_MESSAGE_ID.key);
                sbLIZ2.append("\n            )\n            ORDER BY ");
                sbLIZ2.append(EnumC869540Y9g.COLUMN_RECEIVED_TIME.key);
                sbLIZ2.append(" DESC LIMIT ");
                sbLIZ2.append(20);
                sbLIZ2.append("\n            ");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                ArrayList arrayList = new ArrayList();
                C1ETG c1etg = 0;
                try {
                    try {
                        interfaceC869470Y8zLJIIJJI = this.LIZIZ.LJIIZILJ().LIZIZ().getProxy().LJIIJJI(strLIZIZ, "getPendingMessageBodyList", null);
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                try {
                                    arrayList.add(LIZJ(interfaceC869470Y8zLJIIJJI));
                                } catch (Exception e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("IMPendingMessageBodyDaogetMessageBodyList ");
                                    sbLIZ3.append(e);
                                    c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
                                    this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        c1etg = 20;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZIZ.LJIIZILJ().LIZIZ().LIZ().LIZ(c1etg);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    interfaceC869470Y8zLJIIJJI = null;
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZIZ.LJIIZILJ().LIZIZ().LIZ().LIZ(c1etg);
                        throw th;
                    }
                }
                this.LIZIZ.LJIIZILJ().LIZIZ().LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return arrayList;
            }

            @Override // X.C0Y9V
            public final void clearAll() {
                C868780Y6i.LJ(this.LIZIZ.LIZLLL(), "IMPendingMessageBodyDao", "clearAll", 4);
                this.LIZIZ.LJIIZILJ().LIZIZ().getProxy().LIZIZ("pending_message_body", "", null);
            }

            {
                this.LIZIZ = c0yem;
            }

            public static C869520Y9e LIZJ(InterfaceC869470Y8z interfaceC869470Y8z) {
                return new C869520Y9e(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_MESSAGE_ID.key)), interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_MESSAGE_BODY.key)), interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_REGION.key)), interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_MSG_SOURCE.key)), interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_INBOX_TYPE.key)), interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_RECEIVED_FROM.key)), interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869540Y9g.COLUMN_RECEIVED_TIME.key)));
            }

            @Override // X.C0Y9V
            public final boolean LIZ(C869520Y9e c869520Y9e) {
                C868780Y6i.LJ(this.LIZIZ.LIZLLL(), "IMPendingMessageBodyDao", "insertPendingMessageBody", 4);
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC869540Y9g.COLUMN_MESSAGE_ID.key, Long.valueOf(c869520Y9e.LIZ));
                contentValues.put(EnumC869540Y9g.COLUMN_MESSAGE_BODY.key, c869520Y9e.LIZIZ);
                contentValues.put(EnumC869540Y9g.COLUMN_REGION.key, c869520Y9e.LIZJ);
                contentValues.put(EnumC869540Y9g.COLUMN_MSG_SOURCE.key, Integer.valueOf(c869520Y9e.LIZLLL));
                contentValues.put(EnumC869540Y9g.COLUMN_INBOX_TYPE.key, Integer.valueOf(c869520Y9e.LJ));
                contentValues.put(EnumC869540Y9g.COLUMN_RECEIVED_FROM.key, c869520Y9e.LJFF);
                contentValues.put(EnumC869540Y9g.COLUMN_RECEIVED_TIME.key, Long.valueOf(c869520Y9e.LJI));
                if (this.LIZIZ.LJIIZILJ().LIZIZ().getProxy().LJIIIIZZ("pending_message_body", contentValues, 0) < 0) {
                    return false;
                }
                return true;
            }
        };
    }
}
