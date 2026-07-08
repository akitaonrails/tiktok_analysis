package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19422110yh {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public static final LinkedList<String> LIZIZ = new LinkedList<>();

    public static final boolean LIZ(Challenge challenge) {
        if (challenge.isCommerce() || challenge.isCommerceAndValid()) {
            return true;
        }
        String schema = challenge.getSchema();
        if (schema != null && schema.length() != 0) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(challenge.getSchema()), "is_commerce");
            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1") || u.LJIJI("true", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, true)) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZIZ(String str) {
        int readHoldCount;
        int i = 0;
        if (str != null && str.length() != 0) {
            ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                LIZLLL(str);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
    }

    public static void LIZLLL(String str) {
        if (str != null && str.length() != 0) {
            LinkedList<String> linkedList = LIZIZ;
            linkedList.remove(str);
            linkedList.add(str);
            while (true) {
                LinkedList<String> linkedList2 = LIZIZ;
                if (linkedList2.size() > 100) {
                    linkedList2.removeFirst();
                } else {
                    return;
                }
            }
        }
    }

    public static final void LIZJ(Uri uri, String str) {
        int readHoldCount;
        int i = 0;
        if (str != null && str.length() != 0) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_commerce");
            if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1") || u.LJIJI("true", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, true)) {
                ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        lock.unlock();
                    }
                } else {
                    readHoldCount = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    LIZLLL(str);
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
        }
    }
}
