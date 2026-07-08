package X;

import android.content.res.AssetManager;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1Dbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259271Dbp {
    public static final List<Integer> LJIIZILJ = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> LJIJ = Arrays.asList(2, 7, 4, 5);
    public static final int[] LJIJI = {8, 8, 8};
    public static final int[] LJIJJ = {8};
    public static final byte[] LJIJJLI = {-1, -40, -1};
    public static final byte[] LJIL = {79, 76, 89, 77, 80, 0};
    public static final byte[] LJJ = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final String[] LJJI = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] LJJIFFI = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] LJJII = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final C2259311Dbt LJJIII;
    public static final C2259311Dbt[][] LJJIIJ;
    public static final C2259311Dbt[] LJJIIJZLJL;
    public static final C2259311Dbt LJJIIZ;
    public static final C2259311Dbt LJJIIZI;
    public static final HashMap<Integer, C2259311Dbt>[] LJJIJ;
    public static final HashMap<String, C2259311Dbt>[] LJJIJIIJI;
    public static final HashSet<String> LJJIJIIJIL;
    public static final HashMap<Integer, Integer> LJJIJIL;
    public static final Charset LJJIJL;
    public static final byte[] LJJIJLIJ;
    public static final Pattern LJJIL;
    public final String LIZ;
    public final AssetManager.AssetInputStream LIZIZ;
    public int LIZJ;
    public final HashMap<String, C2259231Dbl>[] LIZLLL;
    public final Set<Integer> LJ;
    public ByteOrder LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public byte[] LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;

    static {
        C2259311Dbt[] c2259311DbtArr = {new C2259311Dbt("NewSubfileType", 254, 4), new C2259311Dbt("SubfileType", 255, 4), new C2259311Dbt("ImageWidth", 256), new C2259311Dbt("ImageLength", 257), new C2259311Dbt("BitsPerSample", 258, 3), new C2259311Dbt("Compression", 259, 3), new C2259311Dbt("PhotometricInterpretation", 262, 3), new C2259311Dbt("ImageDescription", 270, 2), new C2259311Dbt("Make", 271, 2), new C2259311Dbt("Model", 272, 2), new C2259311Dbt("StripOffsets", 273), new C2259311Dbt("Orientation", 274, 3), new C2259311Dbt("SamplesPerPixel", 277, 3), new C2259311Dbt("RowsPerStrip", 278), new C2259311Dbt("StripByteCounts", 279), new C2259311Dbt("XResolution", 282, 5), new C2259311Dbt("YResolution", 283, 5), new C2259311Dbt("PlanarConfiguration", 284, 3), new C2259311Dbt("ResolutionUnit", 296, 3), new C2259311Dbt("TransferFunction", 301, 3), new C2259311Dbt("Software", 305, 2), new C2259311Dbt("DateTime", 306, 2), new C2259311Dbt("Artist", 315, 2), new C2259311Dbt("WhitePoint", 318, 5), new C2259311Dbt("PrimaryChromaticities", 319, 5), new C2259311Dbt("SubIFDPointer", 330, 4), new C2259311Dbt("JPEGInterchangeFormat", 513, 4), new C2259311Dbt("JPEGInterchangeFormatLength", 514, 4), new C2259311Dbt("YCbCrCoefficients", 529, 5), new C2259311Dbt("YCbCrSubSampling", 530, 3), new C2259311Dbt("YCbCrPositioning", 531, 3), new C2259311Dbt("ReferenceBlackWhite", 532, 5), new C2259311Dbt("Copyright", 33432, 2), new C2259311Dbt("ExifIFDPointer", 34665, 4), new C2259311Dbt("GPSInfoIFDPointer", 34853, 4), new C2259311Dbt("SensorTopBorder", 4, 4), new C2259311Dbt("SensorLeftBorder", 5, 4), new C2259311Dbt("SensorBottomBorder", 6, 4), new C2259311Dbt("SensorRightBorder", 7, 4), new C2259311Dbt("ISO", 23, 3), new C2259311Dbt("JpgFromRaw", 46, 7)};
        C2259311Dbt[] c2259311DbtArr2 = {new C2259311Dbt("ExposureTime", 33434, 5), new C2259311Dbt("FNumber", 33437, 5), new C2259311Dbt("ExposureProgram", 34850, 3), new C2259311Dbt("SpectralSensitivity", 34852, 2), new C2259311Dbt("PhotographicSensitivity", 34855, 3), new C2259311Dbt("OECF", 34856, 7), new C2259311Dbt("ExifVersion", 36864, 2), new C2259311Dbt("DateTimeOriginal", 36867, 2), new C2259311Dbt("DateTimeDigitized", 36868, 2), new C2259311Dbt("ComponentsConfiguration", 37121, 7), new C2259311Dbt("CompressedBitsPerPixel", 37122, 5), new C2259311Dbt("ShutterSpeedValue", 37377, 10), new C2259311Dbt("ApertureValue", 37378, 5), new C2259311Dbt("BrightnessValue", 37379, 10), new C2259311Dbt("ExposureBiasValue", 37380, 10), new C2259311Dbt("MaxApertureValue", 37381, 5), new C2259311Dbt("SubjectDistance", 37382, 5), new C2259311Dbt("MeteringMode", 37383, 3), new C2259311Dbt("LightSource", 37384, 3), new C2259311Dbt("Flash", 37385, 3), new C2259311Dbt("FocalLength", 37386, 5), new C2259311Dbt("SubjectArea", 37396, 3), new C2259311Dbt("MakerNote", 37500, 7), new C2259311Dbt("UserComment", 37510, 7), new C2259311Dbt("SubSecTime", 37520, 2), new C2259311Dbt("SubSecTimeOriginal", 37521, 2), new C2259311Dbt("SubSecTimeDigitized", 37522, 2), new C2259311Dbt("FlashpixVersion", 40960, 7), new C2259311Dbt("ColorSpace", 40961, 3), new C2259311Dbt("PixelXDimension", 40962), new C2259311Dbt("PixelYDimension", 40963), new C2259311Dbt("RelatedSoundFile", 40964, 2), new C2259311Dbt("InteroperabilityIFDPointer", 40965, 4), new C2259311Dbt("FlashEnergy", 41483, 5), new C2259311Dbt("SpatialFrequencyResponse", 41484, 7), new C2259311Dbt("FocalPlaneXResolution", 41486, 5), new C2259311Dbt("FocalPlaneYResolution", 41487, 5), new C2259311Dbt("FocalPlaneResolutionUnit", 41488, 3), new C2259311Dbt("SubjectLocation", 41492, 3), new C2259311Dbt("ExposureIndex", 41493, 5), new C2259311Dbt("SensingMethod", 41495, 3), new C2259311Dbt("FileSource", 41728, 7), new C2259311Dbt("SceneType", 41729, 7), new C2259311Dbt("CFAPattern", 41730, 7), new C2259311Dbt("CustomRendered", 41985, 3), new C2259311Dbt("ExposureMode", 41986, 3), new C2259311Dbt("WhiteBalance", 41987, 3), new C2259311Dbt("DigitalZoomRatio", 41988, 5), new C2259311Dbt("FocalLengthIn35mmFilm", 41989, 3), new C2259311Dbt("SceneCaptureType", 41990, 3), new C2259311Dbt("GainControl", 41991, 3), new C2259311Dbt("Contrast", 41992, 3), new C2259311Dbt("Saturation", 41993, 3), new C2259311Dbt("Sharpness", 41994, 3), new C2259311Dbt("DeviceSettingDescription", 41995, 7), new C2259311Dbt("SubjectDistanceRange", 41996, 3), new C2259311Dbt("ImageUniqueID", 42016, 2), new C2259311Dbt("DNGVersion", 50706, 1), new C2259311Dbt("DefaultCropSize", 50720)};
        C2259311Dbt[] c2259311DbtArr3 = {new C2259311Dbt("GPSVersionID", 0, 1), new C2259311Dbt("GPSLatitudeRef", 1, 2), new C2259311Dbt("GPSLatitude", 2, 5), new C2259311Dbt("GPSLongitudeRef", 3, 2), new C2259311Dbt("GPSLongitude", 4, 5), new C2259311Dbt("GPSAltitudeRef", 5, 1), new C2259311Dbt("GPSAltitude", 6, 5), new C2259311Dbt("GPSTimeStamp", 7, 5), new C2259311Dbt("GPSSatellites", 8, 2), new C2259311Dbt("GPSStatus", 9, 2), new C2259311Dbt("GPSMeasureMode", 10, 2), new C2259311Dbt("GPSDOP", 11, 5), new C2259311Dbt("GPSSpeedRef", 12, 2), new C2259311Dbt("GPSSpeed", 13, 5), new C2259311Dbt("GPSTrackRef", 14, 2), new C2259311Dbt("GPSTrack", 15, 5), new C2259311Dbt("GPSImgDirectionRef", 16, 2), new C2259311Dbt("GPSImgDirection", 17, 5), new C2259311Dbt("GPSMapDatum", 18, 2), new C2259311Dbt("GPSDestLatitudeRef", 19, 2), new C2259311Dbt("GPSDestLatitude", 20, 5), new C2259311Dbt("GPSDestLongitudeRef", 21, 2), new C2259311Dbt("GPSDestLongitude", 22, 5), new C2259311Dbt("GPSDestBearingRef", 23, 2), new C2259311Dbt("GPSDestBearing", 24, 5), new C2259311Dbt("GPSDestDistanceRef", 25, 2), new C2259311Dbt("GPSDestDistance", 26, 5), new C2259311Dbt("GPSProcessingMethod", 27, 7), new C2259311Dbt("GPSAreaInformation", 28, 7), new C2259311Dbt("GPSDateStamp", 29, 2), new C2259311Dbt("GPSDifferential", 30, 3)};
        C2259311Dbt[] c2259311DbtArr4 = {new C2259311Dbt("InteroperabilityIndex", 1, 2)};
        C2259311Dbt[] c2259311DbtArr5 = {new C2259311Dbt("NewSubfileType", 254, 4), new C2259311Dbt("SubfileType", 255, 4), new C2259311Dbt("ThumbnailImageWidth", 256), new C2259311Dbt("ThumbnailImageLength", 257), new C2259311Dbt("BitsPerSample", 258, 3), new C2259311Dbt("Compression", 259, 3), new C2259311Dbt("PhotometricInterpretation", 262, 3), new C2259311Dbt("ImageDescription", 270, 2), new C2259311Dbt("Make", 271, 2), new C2259311Dbt("Model", 272, 2), new C2259311Dbt("StripOffsets", 273), new C2259311Dbt("Orientation", 274, 3), new C2259311Dbt("SamplesPerPixel", 277, 3), new C2259311Dbt("RowsPerStrip", 278), new C2259311Dbt("StripByteCounts", 279), new C2259311Dbt("XResolution", 282, 5), new C2259311Dbt("YResolution", 283, 5), new C2259311Dbt("PlanarConfiguration", 284, 3), new C2259311Dbt("ResolutionUnit", 296, 3), new C2259311Dbt("TransferFunction", 301, 3), new C2259311Dbt("Software", 305, 2), new C2259311Dbt("DateTime", 306, 2), new C2259311Dbt("Artist", 315, 2), new C2259311Dbt("WhitePoint", 318, 5), new C2259311Dbt("PrimaryChromaticities", 319, 5), new C2259311Dbt("SubIFDPointer", 330, 4), new C2259311Dbt("JPEGInterchangeFormat", 513, 4), new C2259311Dbt("JPEGInterchangeFormatLength", 514, 4), new C2259311Dbt("YCbCrCoefficients", 529, 5), new C2259311Dbt("YCbCrSubSampling", 530, 3), new C2259311Dbt("YCbCrPositioning", 531, 3), new C2259311Dbt("ReferenceBlackWhite", 532, 5), new C2259311Dbt("Copyright", 33432, 2), new C2259311Dbt("ExifIFDPointer", 34665, 4), new C2259311Dbt("GPSInfoIFDPointer", 34853, 4), new C2259311Dbt("DNGVersion", 50706, 1), new C2259311Dbt("DefaultCropSize", 50720)};
        LJJIII = new C2259311Dbt("StripOffsets", 273, 3);
        LJJIIJ = new C2259311Dbt[][]{c2259311DbtArr, c2259311DbtArr2, c2259311DbtArr3, c2259311DbtArr4, c2259311DbtArr5, c2259311DbtArr, new C2259311Dbt[]{new C2259311Dbt("ThumbnailImage", 256, 7), new C2259311Dbt("CameraSettingsIFDPointer", 8224, 4), new C2259311Dbt("ImageProcessingIFDPointer", 8256, 4)}, new C2259311Dbt[]{new C2259311Dbt("PreviewImageStart", 257, 4), new C2259311Dbt("PreviewImageLength", 258, 4)}, new C2259311Dbt[]{new C2259311Dbt("AspectFrame", 4371, 3)}, new C2259311Dbt[]{new C2259311Dbt("ColorSpace", 55, 3)}};
        LJJIIJZLJL = new C2259311Dbt[]{new C2259311Dbt("SubIFDPointer", 330, 4), new C2259311Dbt("ExifIFDPointer", 34665, 4), new C2259311Dbt("GPSInfoIFDPointer", 34853, 4), new C2259311Dbt("InteroperabilityIFDPointer", 40965, 4), new C2259311Dbt("CameraSettingsIFDPointer", 8224, 1), new C2259311Dbt("ImageProcessingIFDPointer", 8256, 1)};
        LJJIIZ = new C2259311Dbt("JPEGInterchangeFormat", 513, 4);
        LJJIIZI = new C2259311Dbt("JPEGInterchangeFormatLength", 514, 4);
        LJJIJ = new HashMap[10];
        LJJIJIIJI = new HashMap[10];
        LJJIJIIJIL = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        LJJIJIL = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        LJJIJL = charsetForName;
        LJJIJLIJ = "Exif\u0000\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2259311Dbt[][] c2259311DbtArr6 = LJJIIJ;
            if (i >= c2259311DbtArr6.length) {
                HashMap<Integer, Integer> map = LJJIJIL;
                C2259311Dbt[] c2259311DbtArr7 = LJJIIJZLJL;
                map.put(Integer.valueOf(c2259311DbtArr7[0].LIZ), 5);
                map.put(Integer.valueOf(c2259311DbtArr7[1].LIZ), 1);
                map.put(Integer.valueOf(c2259311DbtArr7[2].LIZ), 2);
                map.put(Integer.valueOf(c2259311DbtArr7[3].LIZ), 3);
                map.put(Integer.valueOf(c2259311DbtArr7[4].LIZ), 7);
                map.put(Integer.valueOf(c2259311DbtArr7[5].LIZ), 8);
                PatternProtector.compile(".*[1-9].*");
                LJJIL = PatternProtector.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            LJJIJ[i] = new HashMap<>();
            LJJIJIIJI[i] = new HashMap<>();
            for (C2259311Dbt c2259311Dbt : c2259311DbtArr6[i]) {
                LJJIJ[i].put(Integer.valueOf(c2259311Dbt.LIZ), c2259311Dbt);
                LJJIJIIJI[i].put(c2259311Dbt.LIZIZ, c2259311Dbt);
            }
            i++;
        }
    }

    public final void LIZ() throws Throwable {
        String strLJ = LJ("DateTimeOriginal");
        if (strLJ != null && LJ("DateTime") == null) {
            this.LIZLLL[0].put("DateTime", C2259231Dbl.LIZ(strLJ));
        }
        if (LJ("ImageWidth") == null) {
            this.LIZLLL[0].put("ImageWidth", C2259231Dbl.LIZIZ(0L, this.LJFF));
        }
        if (LJ("ImageLength") == null) {
            this.LIZLLL[0].put("ImageLength", C2259231Dbl.LIZIZ(0L, this.LJFF));
        }
        if (LJ("Orientation") == null) {
            this.LIZLLL[0].put("Orientation", C2259231Dbl.LIZIZ(0L, this.LJFF));
        }
        if (LJ("LightSource") == null) {
            this.LIZLLL[1].put("LightSource", C2259231Dbl.LIZIZ(0L, this.LJFF));
        }
    }

    public final byte[] LJIIL() throws Throwable {
        AssetManager.AssetInputStream assetInputStream;
        InputStream fileInputStream;
        if (!this.LJI) {
            return null;
        }
        byte[] bArr = this.LJIIIZ;
        try {
            if (bArr != null) {
                return bArr;
            }
            try {
                assetInputStream = this.LIZIZ;
                if (assetInputStream != null) {
                    try {
                        if (!assetInputStream.markSupported()) {
                            LIZJ(assetInputStream);
                            return null;
                        }
                        assetInputStream.reset();
                        fileInputStream = assetInputStream;
                    } catch (IOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        LIZJ(assetInputStream);
                        return null;
                    }
                } else {
                    fileInputStream = this.LIZ != null ? new FileInputStream(this.LIZ) : null;
                }
                if (fileInputStream == null) {
                    throw new FileNotFoundException();
                }
                if (fileInputStream.skip(this.LJII) != this.LJII) {
                    throw new IOException("Corrupted image");
                }
                byte[] bArr2 = new byte[this.LJIIIIZZ];
                if (fileInputStream.read(bArr2) != this.LJIIIIZZ) {
                    throw new IOException("Corrupted image");
                }
                this.LJIIIZ = bArr2;
                LIZJ(fileInputStream);
                return bArr2;
            } catch (IOException e2) {
                e = e2;
                assetInputStream = null;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                LIZJ(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void LJIJJLI() throws Throwable {
        FileInputStream fileInputStream;
        if (!this.LJIILLIIL || this.LIZJ != 4) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        }
        if (this.LIZ == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        int i = this.LJIIJ;
        this.LJIIIZ = (i == 6 || i == 7) ? LJIIL() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".tmp");
        File file = new File(C2188811AlT.LIZIZ(sbLIZ));
        ?? file2 = new File(this.LIZ);
        try {
            if (!file2.renameTo(file)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Could not rename to ");
                sbLIZ2.append(file.getAbsolutePath());
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                file2 = 0;
                fileInputStream = null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.LIZ);
                LJIL(fileInputStream, fileOutputStream);
                LIZJ(fileInputStream);
                LIZJ(fileOutputStream);
                file.delete();
                this.LJIIIZ = null;
            } catch (Throwable th2) {
                th = th2;
                file2 = 0;
                TryCatchGuardChecker.doCheck(th);
                LIZJ(fileInputStream);
                LIZJ(file2);
                file.delete();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public C2259271Dbp(String str) throws Throwable {
        C2259311Dbt[][] c2259311DbtArr = LJJIIJ;
        this.LIZLLL = new HashMap[c2259311DbtArr.length];
        this.LJ = new HashSet(c2259311DbtArr.length);
        this.LJFF = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.LIZIZ = null;
            this.LIZ = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    LJIILLIIL(fileInputStream2);
                    LIZJ(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    TryCatchGuardChecker.doCheck(th);
                    LIZJ(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static long[] LIZLLL(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    public static Pair<Integer, Integer> LJIILIIL(String str) {
        int iIntValue;
        int iIntValue2;
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairLJIILIIL = LJIILIIL(strArrSplit[0]);
            if (((Integer) pairLJIILIIL.first).intValue() == 2) {
                return pairLJIILIIL;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairLJIILIIL2 = LJIILIIL(strArrSplit[i]);
                if (!((Integer) pairLJIILIIL2.first).equals(pairLJIILIIL.first) && !((Integer) pairLJIILIIL2.second).equals(pairLJIILIIL.first)) {
                    iIntValue = -1;
                } else {
                    iIntValue = ((Integer) pairLJIILIIL.first).intValue();
                }
                if (((Integer) pairLJIILIIL.second).intValue() != -1 && (((Integer) pairLJIILIIL2.first).equals(pairLJIILIIL.second) || ((Integer) pairLJIILIIL2.second).equals(pairLJIILIIL.second))) {
                    iIntValue2 = ((Integer) pairLJIILIIL.second).intValue();
                } else {
                    iIntValue2 = -1;
                }
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairLJIILIIL = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairLJIILIIL = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairLJIILIIL;
        }
        if (str.contains("/")) {
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j = (long) CastDoubleProtector.parseDouble(strArrSplit2[0]);
                    long j2 = (long) CastDoubleProtector.parseDouble(strArrSplit2[1]);
                    if (j >= 0 && j2 >= 0) {
                        if (j <= 2147483647L && j2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return new Pair<>(2, -1);
        }
        try {
            Long lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            if (lValueOf.longValue() >= 0 && lValueOf.longValue() <= 65535) {
                return new Pair<>(3, 4);
            }
            if (lValueOf.longValue() < 0) {
                return new Pair<>(9, -1);
            }
            return new Pair<>(4, -1);
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            try {
                CastDoubleProtector.parseDouble(str);
                return new Pair<>(12, -1);
            } catch (NumberFormatException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return new Pair<>(2, -1);
            }
        }
    }

    public static ByteOrder LJIJ(C2259291Dbr c2259291Dbr) throws IOException {
        short s = c2259291Dbr.readShort();
        if (s != 18761) {
            if (s == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid byte order: ");
            sbLIZ.append(Integer.toHexString(s));
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final String LJ(String str) throws Throwable {
        C2259221Dbk[] c2259221DbkArr;
        C2259231Dbl c2259231DblLIZIZ = LIZIZ(this, str, new C0WZX("dTF6Tg0zW9KSUE8oQxuKcjuqdIYkEvw5s90asiiVtLGDwjXy3LJD6sHp", new String[]{"01789"}));
        if (c2259231DblLIZIZ != null) {
            if (!LJJIJIIJIL.contains(str)) {
                return c2259231DblLIZIZ.LJIIIIZZ(this.LJFF);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c2259231DblLIZIZ.LIZ;
                if ((i != 5 && i != 10) || (c2259221DbkArr = (C2259221Dbk[]) c2259231DblLIZIZ.LJIIIZ(this.LJFF)) == null || c2259221DbkArr.length != 3) {
                    return null;
                }
                C2259221Dbk c2259221Dbk = c2259221DbkArr[0];
                C2259221Dbk c2259221Dbk2 = c2259221DbkArr[1];
                C2259221Dbk c2259221Dbk3 = c2259221DbkArr[2];
                return C786410Ut5.j4("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (c2259221Dbk.LIZ / c2259221Dbk.LIZIZ)), Integer.valueOf((int) (c2259221Dbk2.LIZ / c2259221Dbk2.LIZIZ)), Integer.valueOf((int) (c2259221Dbk3.LIZ / c2259221Dbk3.LIZIZ))});
            }
            try {
                return Double.toString(c2259231DblLIZIZ.LJI(this.LJFF));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final int LJFF(int i) {
        C2259231Dbl c2259231DblLIZIZ = LIZIZ(this, "Orientation", new C0WZX("dTF6Tg0zW9KSUE8oQxuKcjuqdIYkEvw5s90asiiVtLGDwjXy3LJD6sHp", new String[]{"01789"}));
        if (c2259231DblLIZIZ == null) {
            return i;
        }
        try {
            return c2259231DblLIZIZ.LJII(this.LJFF);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public final int LJII(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = LJIJJLI;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                    for (int i2 = 0; i2 < bytes.length; i2++) {
                        if (bArr[i2] != bytes[i2]) {
                            C2259291Dbr c2259291Dbr = new C2259291Dbr(bArr);
                            ByteOrder byteOrderLJIJ = LJIJ(c2259291Dbr);
                            this.LJFF = byteOrderLJIJ;
                            c2259291Dbr.LLILLJJLI = byteOrderLJIJ;
                            short s = c2259291Dbr.readShort();
                            c2259291Dbr.close();
                            if (s != 20306 && s != 21330) {
                                C2259291Dbr c2259291Dbr2 = new C2259291Dbr(bArr);
                                ByteOrder byteOrderLJIJ2 = LJIJ(c2259291Dbr2);
                                this.LJFF = byteOrderLJIJ2;
                                c2259291Dbr2.LLILLJJLI = byteOrderLJIJ2;
                                short s2 = c2259291Dbr2.readShort();
                                c2259291Dbr2.close();
                                if (s2 != 85) {
                                    return 0;
                                }
                                return 10;
                            }
                            return 7;
                        }
                    }
                    return 9;
                }
                i++;
            } else {
                return 4;
            }
        }
    }

    public final void LJIIIIZZ(C2259291Dbr c2259291Dbr) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        LJIIJ(c2259291Dbr);
        C2259231Dbl c2259231Dbl = this.LIZLLL[1].get("MakerNote");
        if (c2259231Dbl != null) {
            C2259291Dbr c2259291Dbr2 = new C2259291Dbr(c2259231Dbl.LIZJ);
            c2259291Dbr2.LLILLJJLI = this.LJFF;
            byte[] bArr = LJIL;
            byte[] bArr2 = new byte[bArr.length];
            c2259291Dbr2.readFully(bArr2);
            c2259291Dbr2.LIZ(0L);
            byte[] bArr3 = LJJ;
            byte[] bArr4 = new byte[bArr3.length];
            c2259291Dbr2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c2259291Dbr2.LIZ(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c2259291Dbr2.LIZ(12L);
            }
            LJIJI(c2259291Dbr2, 6);
            C2259231Dbl c2259231Dbl2 = this.LIZLLL[7].get("PreviewImageStart");
            C2259231Dbl c2259231Dbl3 = this.LIZLLL[7].get("PreviewImageLength");
            if (c2259231Dbl2 != null && c2259231Dbl3 != null) {
                this.LIZLLL[5].put("JPEGInterchangeFormat", c2259231Dbl2);
                this.LIZLLL[5].put("JPEGInterchangeFormatLength", c2259231Dbl3);
            }
            C2259231Dbl c2259231Dbl4 = this.LIZLLL[8].get("AspectFrame");
            if (c2259231Dbl4 != null && (iArr = (int[]) c2259231Dbl4.LJIIIZ(this.LJFF)) != null && iArr.length == 4 && (i = iArr[2]) > (i2 = iArr[0]) && (i3 = iArr[3]) > (i4 = iArr[1])) {
                int i5 = (i - i2) + 1;
                int i6 = (i3 - i4) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C2259231Dbl c2259231DblLJ = C2259231Dbl.LJ(i5, this.LJFF);
                C2259231Dbl c2259231DblLJ2 = C2259231Dbl.LJ(i6, this.LJFF);
                this.LIZLLL[0].put("ImageWidth", c2259231DblLJ);
                this.LIZLLL[0].put("ImageLength", c2259231DblLJ2);
            }
        }
    }

    public final void LJIIIZ(C2259291Dbr c2259291Dbr) throws IOException {
        c2259291Dbr.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c2259291Dbr.read(bArr);
        c2259291Dbr.skipBytes(4);
        c2259291Dbr.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        LJI(c2259291Dbr, i, 5);
        c2259291Dbr.LIZ(i2);
        c2259291Dbr.LLILLJJLI = ByteOrder.BIG_ENDIAN;
        int i3 = c2259291Dbr.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            int unsignedShort = c2259291Dbr.readUnsignedShort();
            int unsignedShort2 = c2259291Dbr.readUnsignedShort();
            if (unsignedShort == LJJIII.LIZ) {
                short s = c2259291Dbr.readShort();
                short s2 = c2259291Dbr.readShort();
                C2259231Dbl c2259231DblLJ = C2259231Dbl.LJ(s, this.LJFF);
                C2259231Dbl c2259231DblLJ2 = C2259231Dbl.LJ(s2, this.LJFF);
                this.LIZLLL[0].put("ImageLength", c2259231DblLJ);
                this.LIZLLL[0].put("ImageWidth", c2259231DblLJ2);
                return;
            }
            c2259291Dbr.skipBytes(unsignedShort2);
        }
    }

    public final void LJIIJ(C2259291Dbr c2259291Dbr) throws Throwable {
        C2259231Dbl c2259231Dbl;
        LJIIZILJ(c2259291Dbr, c2259291Dbr.available());
        LJIJI(c2259291Dbr, 0);
        LJJII(c2259291Dbr, 0);
        LJJII(c2259291Dbr, 5);
        LJJII(c2259291Dbr, 4);
        LJJIFFI(0, 5);
        LJJIFFI(0, 4);
        LJJIFFI(5, 4);
        C2259231Dbl c2259231Dbl2 = this.LIZLLL[1].get("PixelXDimension");
        C2259231Dbl c2259231Dbl3 = this.LIZLLL[1].get("PixelYDimension");
        if (c2259231Dbl2 != null && c2259231Dbl3 != null) {
            this.LIZLLL[0].put("ImageWidth", c2259231Dbl2);
            this.LIZLLL[0].put("ImageLength", c2259231Dbl3);
        }
        if (this.LIZLLL[4].isEmpty() && LJIILL(this.LIZLLL[5])) {
            HashMap<String, C2259231Dbl>[] mapArr = this.LIZLLL;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        LJIILL(this.LIZLLL[4]);
        if (this.LIZJ == 8 && (c2259231Dbl = this.LIZLLL[1].get("MakerNote")) != null) {
            C2259291Dbr c2259291Dbr2 = new C2259291Dbr(c2259231Dbl.LIZJ);
            c2259291Dbr2.LLILLJJLI = this.LJFF;
            c2259291Dbr2.LIZ(6L);
            LJIJI(c2259291Dbr2, 9);
            C2259231Dbl c2259231Dbl4 = this.LIZLLL[9].get("ColorSpace");
            if (c2259231Dbl4 != null) {
                this.LIZLLL[1].put("ColorSpace", c2259231Dbl4);
            }
        }
    }

    public final void LJIIJJI(C2259291Dbr c2259291Dbr) throws Throwable {
        LJIIJ(c2259291Dbr);
        if (this.LIZLLL[0].get("JpgFromRaw") != null) {
            LJI(c2259291Dbr, this.LJIILL, 5);
        }
        C2259231Dbl c2259231Dbl = this.LIZLLL[0].get("ISO");
        C2259231Dbl c2259231Dbl2 = this.LIZLLL[1].get("PhotographicSensitivity");
        if (c2259231Dbl != null && c2259231Dbl2 == null) {
            this.LIZLLL[1].put("PhotographicSensitivity", c2259231Dbl);
        }
    }

    public final boolean LJIILL(HashMap map) throws Throwable {
        C2259231Dbl c2259231Dbl = (C2259231Dbl) map.get("ImageLength");
        C2259231Dbl c2259231Dbl2 = (C2259231Dbl) map.get("ImageWidth");
        if (c2259231Dbl != null && c2259231Dbl2 != null) {
            int iLJII = c2259231Dbl.LJII(this.LJFF);
            int iLJII2 = c2259231Dbl2.LJII(this.LJFF);
            if (iLJII <= 512 && iLJII2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIILLIIL(InputStream inputStream) throws Throwable {
        for (int i = 0; i < LJJIIJ.length; i++) {
            try {
                try {
                    this.LIZLLL[i] = new HashMap<>();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LJIILLIIL = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.LIZJ = LJII(bufferedInputStream);
        C2259291Dbr c2259291Dbr = new C2259291Dbr(bufferedInputStream);
        switch (this.LIZJ) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJIIJ(c2259291Dbr);
                break;
            case 4:
                LJI(c2259291Dbr, 0, 0);
                break;
            case 7:
                LJIIIIZZ(c2259291Dbr);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJIIIZ(c2259291Dbr);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJIIJJI(c2259291Dbr);
                break;
        }
        LJJI(c2259291Dbr);
        this.LJIILLIIL = true;
        LIZ();
    }

    public final void LJIJJ(String str) {
        for (int i = 0; i < LJJIIJ.length; i++) {
            this.LIZLLL[i].remove(str);
        }
    }

    public final void LJJ(String str) {
        C2259311Dbt c2259311Dbt;
        int i;
        C2259231Dbl c2259231Dbl;
        String strLIZIZ;
        String string = str;
        int i2 = 2;
        int i3 = 1;
        if (string != null && LJJIJIIJIL.contains("UserComment")) {
            if ("UserComment".equals("GPSTimeStamp")) {
                Matcher matcher = LJJIL.matcher(string);
                if (!matcher.find()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(CastIntegerProtector.parseInt(matcher.group(1)));
                sbLIZ.append("/1,");
                sbLIZ.append(CastIntegerProtector.parseInt(matcher.group(2)));
                sbLIZ.append("/1,");
                sbLIZ.append(CastIntegerProtector.parseInt(matcher.group(3)));
                sbLIZ.append("/1");
                string = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                try {
                    string = new C2259221Dbk((long) (CastDoubleProtector.parseDouble(string) * 10000.0d), 10000L).toString();
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < LJJIIJ.length) {
            if ((i5 != 4 || this.LJI) && (c2259311Dbt = LJJIJIIJI[i5].get("UserComment")) != null) {
                if (string == null) {
                    this.LIZLLL[i5].remove("UserComment");
                } else {
                    Pair<Integer, Integer> pairLJIILIIL = LJIILIIL(string);
                    if (c2259311Dbt.LIZJ != ((Integer) pairLJIILIIL.first).intValue() && c2259311Dbt.LIZJ != ((Integer) pairLJIILIIL.second).intValue()) {
                        int i6 = c2259311Dbt.LIZLLL;
                        if (i6 != -1 && (i6 == ((Integer) pairLJIILIIL.first).intValue() || c2259311Dbt.LIZLLL == ((Integer) pairLJIILIIL.second).intValue())) {
                            i = c2259311Dbt.LIZLLL;
                        } else {
                            i = c2259311Dbt.LIZJ;
                            if (i != i3 && i != 7 && i != i2) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Given tag (");
                                sbLIZ2.append("UserComment");
                                sbLIZ2.append(") value didn't match with one of expected ");
                                sbLIZ2.append("formats: ");
                                String[] strArr = LJJI;
                                sbLIZ2.append(strArr[c2259311Dbt.LIZJ]);
                                String strLIZIZ2 = "";
                                if (c2259311Dbt.LIZLLL == -1) {
                                    strLIZIZ = "";
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(", ");
                                    sbLIZ3.append(strArr[c2259311Dbt.LIZLLL]);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                }
                                sbLIZ2.append(strLIZIZ);
                                sbLIZ2.append(" (guess: ");
                                sbLIZ2.append(strArr[((Integer) pairLJIILIIL.first).intValue()]);
                                if (((Integer) pairLJIILIIL.second).intValue() != -1) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(", ");
                                    sbLIZ4.append(strArr[((Integer) pairLJIILIIL.second).intValue()]);
                                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                                }
                                sbLIZ2.append(strLIZIZ2);
                                sbLIZ2.append(")");
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                    } else {
                        i = c2259311Dbt.LIZJ;
                    }
                    switch (i) {
                        case 1:
                            HashMap<String, C2259231Dbl> map = this.LIZLLL[i5];
                            if (string.length() == 1 && string.charAt(0) >= '0' && string.charAt(0) <= '1') {
                                c2259231Dbl = new C2259231Dbl(1, new byte[]{(byte) (string.charAt(0) - '0')}, 1);
                            } else {
                                byte[] bytes = string.getBytes(LJJIJL);
                                c2259231Dbl = new C2259231Dbl(1, bytes, bytes.length);
                            }
                            map.put("UserComment", c2259231Dbl);
                            break;
                        case 2:
                        case 7:
                            this.LIZLLL[i5].put("UserComment", C2259231Dbl.LIZ(string));
                            break;
                        case 3:
                            String[] strArrSplit = string.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                                iArr[i7] = CastIntegerProtector.parseInt(strArrSplit[i7]);
                            }
                            this.LIZLLL[i5].put("UserComment", C2259231Dbl.LJFF(iArr, this.LJFF));
                            break;
                        case 4:
                            String[] strArrSplit2 = string.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i8 = 0; i8 < strArrSplit2.length; i8++) {
                                jArr[i8] = CastLongProtector.parseLong(strArrSplit2[i8]);
                            }
                            this.LIZLLL[i5].put("UserComment", C2259231Dbl.LIZJ(jArr, this.LJFF));
                            break;
                        case 5:
                            String[] strArrSplit3 = string.split(",", -1);
                            C2259221Dbk[] c2259221DbkArr = new C2259221Dbk[strArrSplit3.length];
                            while (i4 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i4].split("/", -1);
                                c2259221DbkArr[i4] = new C2259221Dbk((long) CastDoubleProtector.parseDouble(strArrSplit4[0]), (long) CastDoubleProtector.parseDouble(strArrSplit4[1]));
                                i4++;
                            }
                            this.LIZLLL[i5].put("UserComment", C2259231Dbl.LIZLLL(c2259221DbkArr, this.LJFF));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            String[] strArrSplit5 = string.split(",", -1);
                            int length = strArrSplit5.length;
                            int[] iArr2 = new int[length];
                            for (int i9 = 0; i9 < strArrSplit5.length; i9++) {
                                iArr2[i9] = CastIntegerProtector.parseInt(strArrSplit5[i9]);
                            }
                            HashMap<String, C2259231Dbl> map2 = this.LIZLLL[i5];
                            ByteOrder byteOrder = this.LJFF;
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[LJJIFFI[9] * length]);
                            byteBufferWrap.order(byteOrder);
                            for (int i10 = 0; i10 < length; i10++) {
                                byteBufferWrap.putInt(iArr2[i10]);
                            }
                            map2.put("UserComment", new C2259231Dbl(9, byteBufferWrap.array(), length));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            String[] strArrSplit6 = string.split(",", -1);
                            int length2 = strArrSplit6.length;
                            C2259221Dbk[] c2259221DbkArr2 = new C2259221Dbk[length2];
                            int i11 = 0;
                            while (i11 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i11].split("/", -1);
                                c2259221DbkArr2[i11] = new C2259221Dbk((long) CastDoubleProtector.parseDouble(strArrSplit7[i4]), (long) CastDoubleProtector.parseDouble(strArrSplit7[i3]));
                                i11++;
                                i3 = 1;
                                i4 = 0;
                            }
                            HashMap<String, C2259231Dbl> map3 = this.LIZLLL[i5];
                            ByteOrder byteOrder2 = this.LJFF;
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[LJJIFFI[10] * length2]);
                            byteBufferWrap2.order(byteOrder2);
                            for (int i12 = 0; i12 < length2; i12++) {
                                C2259221Dbk c2259221Dbk = c2259221DbkArr2[i12];
                                byteBufferWrap2.putInt((int) c2259221Dbk.LIZ);
                                byteBufferWrap2.putInt((int) c2259221Dbk.LIZIZ);
                            }
                            map3.put("UserComment", new C2259231Dbl(10, byteBufferWrap2.array(), length2));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            String[] strArrSplit8 = string.split(",", -1);
                            int length3 = strArrSplit8.length;
                            double[] dArr = new double[length3];
                            for (int i13 = 0; i13 < strArrSplit8.length; i13++) {
                                dArr[i13] = CastDoubleProtector.parseDouble(strArrSplit8[i13]);
                            }
                            HashMap<String, C2259231Dbl> map4 = this.LIZLLL[i5];
                            ByteOrder byteOrder3 = this.LJFF;
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[LJJIFFI[12] * length3]);
                            byteBufferWrap3.order(byteOrder3);
                            for (int i14 = 0; i14 < length3; i14++) {
                                byteBufferWrap3.putDouble(dArr[i14]);
                            }
                            map4.put("UserComment", new C2259231Dbl(12, byteBufferWrap3.array(), length3));
                            break;
                    }
                }
            }
            i5++;
            i2 = 2;
            i4 = 0;
            i3 = 1;
        }
    }

    public final void LJJI(C2259291Dbr c2259291Dbr) throws Throwable {
        C2259231Dbl c2259231Dbl;
        HashMap<String, C2259231Dbl> map = this.LIZLLL[4];
        C2259231Dbl c2259231Dbl2 = map.get("Compression");
        if (c2259231Dbl2 != null) {
            int iLJII = c2259231Dbl2.LJII(this.LJFF);
            this.LJIIJ = iLJII;
            if (iLJII != 1) {
                if (iLJII != 6) {
                    if (iLJII != 7) {
                        return;
                    }
                } else {
                    LJIILJJIL(c2259291Dbr, map);
                    return;
                }
            }
            C2259231Dbl c2259231Dbl3 = map.get("BitsPerSample");
            if (c2259231Dbl3 == null) {
                return;
            }
            int[] iArr = (int[]) c2259231Dbl3.LJIIIZ(this.LJFF);
            int[] iArr2 = LJIJI;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.LIZJ != 3 || (c2259231Dbl = map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iLJII2 = c2259231Dbl.LJII(this.LJFF);
                if (iLJII2 == 1) {
                    if (!Arrays.equals(iArr, LJIJJ)) {
                        return;
                    }
                } else if (iLJII2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            C2259231Dbl c2259231Dbl4 = map.get("StripOffsets");
            C2259231Dbl c2259231Dbl5 = map.get("StripByteCounts");
            if (c2259231Dbl4 == null || c2259231Dbl5 == null) {
                return;
            }
            long[] jArrLIZLLL = LIZLLL(c2259231Dbl4.LJIIIZ(this.LJFF));
            long[] jArrLIZLLL2 = LIZLLL(c2259231Dbl5.LJIIIZ(this.LJFF));
            if (jArrLIZLLL == null || jArrLIZLLL2 == null) {
                return;
            }
            long j = 0;
            for (long j2 : jArrLIZLLL2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrLIZLLL.length; i4++) {
                int i5 = (int) jArrLIZLLL[i4];
                int i6 = (int) jArrLIZLLL2[i4];
                int i7 = i5 - i2;
                c2259291Dbr.LIZ(i7);
                byte[] bArr2 = new byte[i6];
                c2259291Dbr.read(bArr2);
                i2 = i2 + i7 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.LJI = true;
            this.LJIIIZ = bArr;
            this.LJIIIIZZ = i;
            return;
        }
        this.LJIIJ = 6;
        LJIILJJIL(c2259291Dbr, map);
    }

    public C2259271Dbp(InputStream inputStream) throws Throwable {
        C2259311Dbt[][] c2259311DbtArr = LJJIIJ;
        this.LIZLLL = new HashMap[c2259311DbtArr.length];
        this.LJ = new HashSet(c2259311DbtArr.length);
        this.LJFF = ByteOrder.BIG_ENDIAN;
        this.LIZ = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.LIZIZ = (AssetManager.AssetInputStream) inputStream;
        } else {
            this.LIZIZ = null;
        }
        LJIILLIIL(inputStream);
    }

    public final void LJIILJJIL(C2259291Dbr c2259291Dbr, HashMap map) throws Throwable {
        int i;
        C2259231Dbl c2259231Dbl = (C2259231Dbl) map.get("JPEGInterchangeFormat");
        C2259231Dbl c2259231Dbl2 = (C2259231Dbl) map.get("JPEGInterchangeFormatLength");
        if (c2259231Dbl != null && c2259231Dbl2 != null) {
            int iLJII = c2259231Dbl.LJII(this.LJFF);
            int iMin = Math.min(c2259231Dbl2.LJII(this.LJFF), c2259291Dbr.available() - iLJII);
            int i2 = this.LIZJ;
            if (i2 != 4 && i2 != 9 && i2 != 10) {
                if (i2 == 7) {
                    i = this.LJIIL;
                }
                if (iLJII <= 0 && iMin > 0) {
                    this.LJI = true;
                    this.LJII = iLJII;
                    this.LJIIIIZZ = iMin;
                    if (this.LIZ == null && this.LIZIZ == null) {
                        byte[] bArr = new byte[iMin];
                        c2259291Dbr.LIZ(iLJII);
                        c2259291Dbr.readFully(bArr);
                        this.LJIIIZ = bArr;
                        return;
                    }
                    return;
                }
            }
            i = this.LJIIJJI;
            iLJII += i;
            if (iLJII <= 0) {
            }
        }
    }

    public final void LJIIZILJ(C2259291Dbr c2259291Dbr, int i) throws IOException {
        ByteOrder byteOrderLJIJ = LJIJ(c2259291Dbr);
        this.LJFF = byteOrderLJIJ;
        c2259291Dbr.LLILLJJLI = byteOrderLJIJ;
        int unsignedShort = c2259291Dbr.readUnsignedShort();
        int i2 = this.LIZJ;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid start code: ");
            sbLIZ.append(Integer.toHexString(unsignedShort));
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i3 = c2259291Dbr.readInt();
        if (i3 >= 8 && i3 < i) {
            int i4 = i3 - 8;
            if (i4 > 0 && c2259291Dbr.skipBytes(i4) != i4) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Couldn't jump to first Ifd: ");
                sbLIZ2.append(i4);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Invalid first Ifd offset: ");
        sbLIZ3.append(i3);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C2259291Dbr r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259271Dbp.LJIJI(X.1Dbr, int):void");
    }

    public final void LJIL(InputStream inputStream, OutputStream outputStream) throws IOException {
        short s;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C2259201Dbi c2259201Dbi = new C2259201Dbi(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            c2259201Dbi.LIZ(-1);
            if (dataInputStream.readByte() == -40) {
                c2259201Dbi.LIZ(-40);
                c2259201Dbi.LIZ(-1);
                c2259201Dbi.LIZ(-31);
                C2259311Dbt[][] c2259311DbtArr = LJJIIJ;
                int[] iArr = new int[c2259311DbtArr.length];
                int[] iArr2 = new int[c2259311DbtArr.length];
                for (C2259311Dbt c2259311Dbt : LJJIIJZLJL) {
                    LJIJJ(c2259311Dbt.LIZIZ);
                }
                LJIJJ(LJJIIZ.LIZIZ);
                LJIJJ(LJJIIZI.LIZIZ);
                for (int i = 0; i < LJJIIJ.length; i++) {
                    for (Object obj : this.LIZLLL[i].entrySet().toArray()) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry.getValue() == null) {
                            this.LIZLLL[i].remove(entry.getKey());
                        }
                    }
                }
                if (!this.LIZLLL[1].isEmpty()) {
                    this.LIZLLL[0].put(LJJIIJZLJL[1].LIZIZ, C2259231Dbl.LIZIZ(0L, this.LJFF));
                }
                if (!this.LIZLLL[2].isEmpty()) {
                    this.LIZLLL[0].put(LJJIIJZLJL[2].LIZIZ, C2259231Dbl.LIZIZ(0L, this.LJFF));
                }
                if (!this.LIZLLL[3].isEmpty()) {
                    this.LIZLLL[1].put(LJJIIJZLJL[3].LIZIZ, C2259231Dbl.LIZIZ(0L, this.LJFF));
                }
                if (this.LJI) {
                    this.LIZLLL[4].put(LJJIIZ.LIZIZ, C2259231Dbl.LIZIZ(0L, this.LJFF));
                    this.LIZLLL[4].put(LJJIIZI.LIZIZ, C2259231Dbl.LIZIZ(this.LJIIIIZZ, this.LJFF));
                }
                for (int i2 = 0; i2 < LJJIIJ.length; i2++) {
                    Iterator<Map.Entry<String, C2259231Dbl>> it2 = this.LIZLLL[i2].entrySet().iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        C2259231Dbl value = it2.next().getValue();
                        value.getClass();
                        int i4 = LJJIFFI[value.LIZ] * value.LIZIZ;
                        if (i4 > 4) {
                            i3 += i4;
                        }
                    }
                    iArr2[i2] = iArr2[i2] + i3;
                }
                int size = 8;
                for (int i5 = 0; i5 < LJJIIJ.length; i5++) {
                    if (!this.LIZLLL[i5].isEmpty()) {
                        iArr[i5] = size;
                        size += (this.LIZLLL[i5].size() * 12) + 2 + 4 + iArr2[i5];
                    }
                }
                if (this.LJI) {
                    this.LIZLLL[4].put(LJJIIZ.LIZIZ, C2259231Dbl.LIZIZ(size, this.LJFF));
                    this.LJII = size + 6;
                    size += this.LJIIIIZZ;
                }
                int i6 = size + 8;
                if (!this.LIZLLL[1].isEmpty()) {
                    this.LIZLLL[0].put(LJJIIJZLJL[1].LIZIZ, C2259231Dbl.LIZIZ(iArr[1], this.LJFF));
                }
                if (!this.LIZLLL[2].isEmpty()) {
                    this.LIZLLL[0].put(LJJIIJZLJL[2].LIZIZ, C2259231Dbl.LIZIZ(iArr[2], this.LJFF));
                }
                if (!this.LIZLLL[3].isEmpty()) {
                    this.LIZLLL[1].put(LJJIIJZLJL[3].LIZIZ, C2259231Dbl.LIZIZ(iArr[3], this.LJFF));
                }
                c2259201Dbi.LIZLLL((short) i6);
                c2259201Dbi.write(LJJIJLIJ);
                if (this.LJFF == ByteOrder.BIG_ENDIAN) {
                    s = 19789;
                } else {
                    s = 18761;
                }
                c2259201Dbi.LIZLLL(s);
                c2259201Dbi.LLILLJJLI = this.LJFF;
                c2259201Dbi.LIZLLL((short) 42);
                c2259201Dbi.LIZIZ((int) 8);
                for (int i7 = 0; i7 < LJJIIJ.length; i7++) {
                    if (!this.LIZLLL[i7].isEmpty()) {
                        c2259201Dbi.LIZLLL((short) this.LIZLLL[i7].size());
                        int size2 = iArr[i7] + 2 + (this.LIZLLL[i7].size() * 12) + 4;
                        for (Map.Entry<String, C2259231Dbl> entry2 : this.LIZLLL[i7].entrySet()) {
                            int i8 = LJJIJIIJI[i7].get(entry2.getKey()).LIZ;
                            C2259231Dbl value2 = entry2.getValue();
                            value2.getClass();
                            int i9 = LJJIFFI[value2.LIZ] * value2.LIZIZ;
                            c2259201Dbi.LIZLLL((short) i8);
                            c2259201Dbi.LIZLLL((short) value2.LIZ);
                            c2259201Dbi.LIZIZ(value2.LIZIZ);
                            if (i9 > 4) {
                                c2259201Dbi.LIZIZ(size2);
                                size2 += i9;
                            } else {
                                c2259201Dbi.write(value2.LIZJ);
                                if (i9 < 4) {
                                    do {
                                        c2259201Dbi.LIZ(0);
                                        i9++;
                                    } while (i9 < 4);
                                }
                            }
                        }
                        if (i7 == 0 && !this.LIZLLL[4].isEmpty()) {
                            c2259201Dbi.LIZIZ(iArr[4]);
                        } else {
                            c2259201Dbi.LIZIZ((int) 0);
                        }
                        Iterator<Map.Entry<String, C2259231Dbl>> it3 = this.LIZLLL[i7].entrySet().iterator();
                        while (it3.hasNext()) {
                            byte[] bArr = it3.next().getValue().LIZJ;
                            if (bArr.length > 4) {
                                c2259201Dbi.write(bArr, 0, bArr.length);
                            }
                        }
                    }
                }
                if (this.LJI) {
                    c2259201Dbi.write(LJIIL());
                }
                c2259201Dbi.LLILLJJLI = ByteOrder.BIG_ENDIAN;
                byte[] bArr2 = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (dataInputStream.readByte() == -1) {
                    byte b = dataInputStream.readByte();
                    if (b != -39 && b != -38) {
                        if (b != -31) {
                            c2259201Dbi.LIZ(-1);
                            c2259201Dbi.LIZ(b);
                            int unsignedShort = dataInputStream.readUnsignedShort();
                            c2259201Dbi.LIZLLL((short) unsignedShort);
                            int i10 = unsignedShort - 2;
                            if (i10 < 0) {
                                throw new IOException("Invalid length");
                            }
                            while (i10 > 0) {
                                int i11 = dataInputStream.read(bArr2, 0, Math.min(i10, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                                if (i11 >= 0) {
                                    c2259201Dbi.write(bArr2, 0, i11);
                                    i10 -= i11;
                                }
                            }
                        } else {
                            int unsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                            if (unsignedShort2 >= 0) {
                                byte[] bArr3 = new byte[6];
                                if (unsignedShort2 >= 6) {
                                    if (dataInputStream.read(bArr3) == 6) {
                                        if (Arrays.equals(bArr3, LJJIJLIJ)) {
                                            int i12 = unsignedShort2 - 6;
                                            if (dataInputStream.skipBytes(i12) != i12) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                c2259201Dbi.LIZ(-1);
                                c2259201Dbi.LIZ(b);
                                c2259201Dbi.LIZLLL((short) (unsignedShort2 + 2));
                                if (unsignedShort2 >= 6) {
                                    unsignedShort2 -= 6;
                                    c2259201Dbi.write(bArr3);
                                }
                                while (unsignedShort2 > 0) {
                                    int i13 = dataInputStream.read(bArr2, 0, Math.min(unsignedShort2, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                                    if (i13 >= 0) {
                                        c2259201Dbi.write(bArr2, 0, i13);
                                        unsignedShort2 -= i13;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c2259201Dbi.LIZ(-1);
                        c2259201Dbi.LIZ(b);
                        byte[] bArr4 = new byte[8192];
                        while (true) {
                            int i14 = dataInputStream.read(bArr4);
                            if (i14 != -1) {
                                c2259201Dbi.write(bArr4, 0, i14);
                            } else {
                                return;
                            }
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void LJJIFFI(int i, int i2) throws Throwable {
        if (!this.LIZLLL[i].isEmpty() && !this.LIZLLL[i2].isEmpty()) {
            C2259231Dbl c2259231Dbl = this.LIZLLL[i].get("ImageLength");
            C2259231Dbl c2259231Dbl2 = this.LIZLLL[i].get("ImageWidth");
            C2259231Dbl c2259231Dbl3 = this.LIZLLL[i2].get("ImageLength");
            C2259231Dbl c2259231Dbl4 = this.LIZLLL[i2].get("ImageWidth");
            if (c2259231Dbl != null && c2259231Dbl2 != null && c2259231Dbl3 != null && c2259231Dbl4 != null) {
                int iLJII = c2259231Dbl.LJII(this.LJFF);
                int iLJII2 = c2259231Dbl2.LJII(this.LJFF);
                int iLJII3 = c2259231Dbl3.LJII(this.LJFF);
                int iLJII4 = c2259231Dbl4.LJII(this.LJFF);
                if (iLJII < iLJII3 && iLJII2 < iLJII4) {
                    HashMap<String, C2259231Dbl>[] mapArr = this.LIZLLL;
                    HashMap<String, C2259231Dbl> map = mapArr[i];
                    mapArr[i] = mapArr[i2];
                    mapArr[i2] = map;
                }
            }
        }
    }

    public final void LJJII(C2259291Dbr c2259291Dbr, int i) throws Throwable {
        C2259231Dbl c2259231Dbl;
        C2259231Dbl c2259231DblLJ;
        C2259231Dbl c2259231DblLJ2;
        C2259231Dbl c2259231Dbl2 = this.LIZLLL[i].get("DefaultCropSize");
        C2259231Dbl c2259231Dbl3 = this.LIZLLL[i].get("SensorTopBorder");
        C2259231Dbl c2259231Dbl4 = this.LIZLLL[i].get("SensorLeftBorder");
        C2259231Dbl c2259231Dbl5 = this.LIZLLL[i].get("SensorBottomBorder");
        C2259231Dbl c2259231Dbl6 = this.LIZLLL[i].get("SensorRightBorder");
        if (c2259231Dbl2 != null) {
            if (c2259231Dbl2.LIZ == 5) {
                C2259221Dbk[] c2259221DbkArr = (C2259221Dbk[]) c2259231Dbl2.LJIIIZ(this.LJFF);
                if (c2259221DbkArr != null && c2259221DbkArr.length == 2) {
                    c2259231DblLJ = C2259231Dbl.LIZLLL(new C2259221Dbk[]{c2259221DbkArr[0]}, this.LJFF);
                    c2259231DblLJ2 = C2259231Dbl.LIZLLL(new C2259221Dbk[]{c2259221DbkArr[1]}, this.LJFF);
                } else {
                    return;
                }
            } else {
                int[] iArr = (int[]) c2259231Dbl2.LJIIIZ(this.LJFF);
                if (iArr != null && iArr.length == 2) {
                    c2259231DblLJ = C2259231Dbl.LJ(iArr[0], this.LJFF);
                    c2259231DblLJ2 = C2259231Dbl.LJ(iArr[1], this.LJFF);
                } else {
                    return;
                }
            }
            this.LIZLLL[i].put("ImageWidth", c2259231DblLJ);
            this.LIZLLL[i].put("ImageLength", c2259231DblLJ2);
            return;
        }
        if (c2259231Dbl3 != null && c2259231Dbl4 != null && c2259231Dbl5 != null && c2259231Dbl6 != null) {
            int iLJII = c2259231Dbl3.LJII(this.LJFF);
            int iLJII2 = c2259231Dbl5.LJII(this.LJFF);
            int iLJII3 = c2259231Dbl6.LJII(this.LJFF);
            int iLJII4 = c2259231Dbl4.LJII(this.LJFF);
            if (iLJII2 <= iLJII || iLJII3 <= iLJII4) {
                return;
            }
            C2259231Dbl c2259231DblLJ3 = C2259231Dbl.LJ(iLJII2 - iLJII, this.LJFF);
            C2259231Dbl c2259231DblLJ4 = C2259231Dbl.LJ(iLJII3 - iLJII4, this.LJFF);
            this.LIZLLL[i].put("ImageLength", c2259231DblLJ3);
            this.LIZLLL[i].put("ImageWidth", c2259231DblLJ4);
            return;
        }
        C2259231Dbl c2259231Dbl7 = this.LIZLLL[i].get("ImageLength");
        C2259231Dbl c2259231Dbl8 = this.LIZLLL[i].get("ImageWidth");
        if ((c2259231Dbl7 != null && c2259231Dbl8 != null) || (c2259231Dbl = this.LIZLLL[i].get("JPEGInterchangeFormat")) == null) {
            return;
        }
        LJI(c2259291Dbr, c2259231Dbl.LJII(this.LJFF), i);
    }

    public static C2259231Dbl LIZIZ(C2259271Dbp c2259271Dbp, String str, C0WZX c0wzx) throws Throwable {
        C2259231Dbl c2259231Dbl;
        Object obj = str;
        C2259271Dbp c2259271Dbp2 = c2259271Dbp;
        C0WST c0wst = new C0WST();
        int i = 0;
        Object[] objArr = {obj};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)Landroidx/exifinterface/media/ExifInterface$ExifAttribute;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10875, "androidx/exifinterface/media/ExifInterface", "getExifAttribute", c2259271Dbp2, objArr, "androidx.exifinterface.media.ExifInterface$ExifAttribute", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(10875, "androidx/exifinterface/media/ExifInterface", "getExifAttribute", null, objArr, c2259271Dbp2, c0wzw, false);
            return (C2259231Dbl) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj2 = objArr2[0];
            if (obj2 != null) {
                c2259271Dbp2 = (C2259271Dbp) obj2;
            }
            Object obj3 = objArr2[1];
            if (obj3 != null) {
                obj = obj3;
            }
        }
        c2259271Dbp2.getClass();
        if ("ISOSpeedRatings".equals(obj)) {
            obj = "PhotographicSensitivity";
        }
        while (true) {
            if (i < LJJIIJ.length) {
                c2259231Dbl = c2259271Dbp2.LIZLLL[i].get(obj);
                if (c2259231Dbl != null) {
                    break;
                }
                i++;
            } else {
                c2259231Dbl = null;
                break;
            }
        }
        c0wst.LIZ(10875, "androidx/exifinterface/media/ExifInterface", "getExifAttribute", c2259231Dbl, objArr, c2259271Dbp2, c0wzw, true);
        return c2259231Dbl;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C2259291Dbr r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259271Dbp.LJI(X.1Dbr, int, int):void");
    }
}
