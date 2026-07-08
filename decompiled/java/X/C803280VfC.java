package X;

/* JADX INFO: renamed from: X.0VfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803280VfC {
    public static String LIZ(int i) {
        return i > 750 ? "(750 - MAX)" : i > 650 ? "(650 - 750]" : i > 550 ? "(550 - 650]" : i > 450 ? "(450 - 550]" : i > 350 ? "(350 - 450]" : i > 250 ? "(250 - 350]" : i > 150 ? "(150 - 250]" : "[0 - 150]";
    }

    public static String LIZIZ(long j) {
        long j2 = j * 1024;
        return j2 > 25769803776L ? "(24GB - MAX)" : j2 > 21474836480L ? "(20GB - 24GB]" : j2 > 17179869184L ? "(16GB - 20GB]" : j2 > 12884901888L ? "(12GB - 16GB]" : j2 > 10737418240L ? "(10GB - 12GB]" : j2 > 9663676416L ? "(9GB - 10GB]" : j2 > 8589934592L ? "(8GB - 9GB]" : j2 > 7516192768L ? "(7GB - 8GB]" : j2 > 6442450944L ? "(6GB - 7GB]" : j2 > 5368709120L ? "(5GB - 6GB]" : j2 > 4294967296L ? "(4GB - 5GB]" : "[0GB - 4GB]";
    }

    public static String LIZJ(long j) {
        long j2 = j * 1024;
        return j2 > 5368709120L ? "(5GB - MAX)" : j2 > 4294967296L ? "(4GB - 5GB]" : j2 > 3221225472L ? "(3GB - 4GB]" : j2 > 2147483648L ? "(2GB - 3GB]" : j2 > 1073741824 ? "(1GB - 2GB]" : j2 > 939524096 ? "(896MB - 1GB]" : j2 > 805306368 ? "(768MB - 896MB]" : j2 > 671088640 ? "(640MB - 768MB]" : j2 > 536870912 ? "(512MB - 640MB]" : j2 > 402653184 ? "(384MB - 512MB]" : j2 > 268435456 ? "(256MB - 384MB]" : j2 > 134217728 ? "(128MB - 256MB]" : "(0MB - 128MB]";
    }

    public static String LIZLLL(long j, boolean z) {
        float f = j * 1024;
        float f2 = z ? 4294967296L : 3221225472L;
        return f > 0.95f * f2 ? "(95% - 100%]" : f > 0.9f * f2 ? "(90% - 95%]" : f > 0.85f * f2 ? "(85% - 90%]" : f > 0.8f * f2 ? "(80% - 85%]" : f > 0.7f * f2 ? "(70% - 80%]" : f > 0.6f * f2 ? "(60% - 70%]" : f > f2 * 0.5f ? "(50% - 60%]" : "[0% - 50%]";
    }
}
