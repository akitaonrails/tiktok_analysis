package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1EPH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EPH {
    public static final C1EPH APP_IN_BACKGROUND;
    public static final C1EPH ASR_PROCESSING_ERROR;
    public static final C1EPH ASR_PROCESSING_TIMEOUT;
    public static final C1EPH ASR_UNKNOWN;
    public static final C1EPH ASR_WAITING_TIMEOUT;
    public static final C1EPH AUDIO_DATA_DECODE_FAILED;
    public static final C1EPH AUDIO_ENCODING_ERROR;
    public static final C1EPH AUDIO_TOO_LONG_OR_LARGE_PACKET;
    public static final C1EPH COUNT_LIMITED;
    public static final C1EPH CREATE_CONNECTION_FAILED;
    public static final C1EPH EXTERNAL_ERROR;
    public static final C1EPH FILE_RECORDER_READ_FAILED;
    public static final C1EPH FILE_RECORDER_WRITE_FAILED;
    public static final C1EPH INIT_ADDRESS_INVALID;
    public static final C1EPH INIT_AUDIO_ENGINE_FAILED;
    public static final C1EPH INIT_AUTH_FAILED;
    public static final C1EPH INIT_CODEC_UNSUPPORTED;
    public static final C1EPH INIT_CREATE_INSTANCE_FAILED;
    public static final C1EPH INIT_CRONET_FAILED;
    public static final C1EPH INIT_GET_OPTION_FAILED;
    public static final C1EPH INIT_OPEN_FILE_FAILED;
    public static final C1EPH INIT_PETREL_FAILED;
    public static final C1EPH INIT_RECORD_ENV_OR_BPEA_FAILED;
    public static final C1EPH INIT_SIGNAL_FAILED;
    public static final C1EPH INIT_START_WITHOUT_INIT;
    public static final C1EPH INIT_UNKNOWN_ENGINE_ERROR;
    public static final C1EPH INIT_WRONG_STATE;
    public static final C1EPH INVALID_AUDIO_FORMAT;
    public static final C1EPH INVALID_REQUEST;
    public static final C1EPH INVALID_RESPONSE;
    public static final /* synthetic */ C1EPH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1EPH NETWORK_CONNECT_FAILED;
    public static final C1EPH NETWORK_CONNECT_TIMEOUT;
    public static final C1EPH NETWORK_LIB_ERROR;
    public static final C1EPH NETWORK_RECEIVE_TIMEOUT;
    public static final C1EPH NO_VOICE;
    public static final C1EPH OUT_OF_MEMORY;
    public static final C1EPH PERMISSION_DENIED;
    public static final C1EPH PRESSED_TOO_SHORT;
    public static final C1EPH QPS_LIMITED;
    public static final C1EPH RECORDER_ENQUEUE_FAILED;
    public static final C1EPH RECORDER_INIT_FAILED;
    public static final C1EPH RECORDER_RENDER_FAILED;
    public static final C1EPH RECORDER_SET_CALLBACK_FAILED;
    public static final C1EPH RECORDER_SET_ENABLE_FAILED;
    public static final C1EPH RECORDER_SET_FORMAT_FAILED;
    public static final C1EPH RECORDER_START_FAILED;
    public static final C1EPH RECORDER_WRITE_FAILED;
    public static final C1EPH RECORDER_WRONG_BUF_QUEUE;
    public static final C1EPH SERVER_BUSY;
    public static final C1EPH SPEECH_OVER_TIMEOUT;
    public static final C1EPH SUCCESS;
    public static final C1EPH SYSTEM_INTERRUPTION;
    public static final C1EPH UNKNOWN;
    public static final C1EPH USER_CANCEL;
    public final int LL;

    public static InterfaceC2044707zh<C1EPH> getEntries() {
        return LLILLL;
    }

    static {
        C1EPH c1eph = new C1EPH("SUCCESS", 0, 0);
        SUCCESS = c1eph;
        C1EPH c1eph2 = new C1EPH("USER_CANCEL", 1, 1001);
        USER_CANCEL = c1eph2;
        C1EPH c1eph3 = new C1EPH("PRESSED_TOO_SHORT", 2, 1002);
        PRESSED_TOO_SHORT = c1eph3;
        C1EPH c1eph4 = new C1EPH("SPEECH_OVER_TIMEOUT", 3, 1003);
        SPEECH_OVER_TIMEOUT = c1eph4;
        C1EPH c1eph5 = new C1EPH("APP_IN_BACKGROUND", 4, 1004);
        APP_IN_BACKGROUND = c1eph5;
        C1EPH c1eph6 = new C1EPH("SYSTEM_INTERRUPTION", 5, 1005);
        SYSTEM_INTERRUPTION = c1eph6;
        C1EPH c1eph7 = new C1EPH("NO_VOICE", 6, 2001);
        NO_VOICE = c1eph7;
        C1EPH c1eph8 = new C1EPH("INVALID_REQUEST", 7, 2002);
        INVALID_REQUEST = c1eph8;
        C1EPH c1eph9 = new C1EPH("PERMISSION_DENIED", 8, 2003);
        PERMISSION_DENIED = c1eph9;
        C1EPH c1eph10 = new C1EPH("QPS_LIMITED", 9, 2004);
        QPS_LIMITED = c1eph10;
        C1EPH c1eph11 = new C1EPH("COUNT_LIMITED", 10, 2005);
        COUNT_LIMITED = c1eph11;
        C1EPH c1eph12 = new C1EPH("SERVER_BUSY", 11, 2006);
        SERVER_BUSY = c1eph12;
        C1EPH c1eph13 = new C1EPH("AUDIO_TOO_LONG_OR_LARGE_PACKET", 12, 2007);
        AUDIO_TOO_LONG_OR_LARGE_PACKET = c1eph13;
        C1EPH c1eph14 = new C1EPH("INVALID_AUDIO_FORMAT", 13, 2008);
        INVALID_AUDIO_FORMAT = c1eph14;
        C1EPH c1eph15 = new C1EPH("ASR_WAITING_TIMEOUT", 14, 2009);
        ASR_WAITING_TIMEOUT = c1eph15;
        C1EPH c1eph16 = new C1EPH("ASR_PROCESSING_TIMEOUT", 15, 2010);
        ASR_PROCESSING_TIMEOUT = c1eph16;
        C1EPH c1eph17 = new C1EPH("ASR_PROCESSING_ERROR", 16, 2011);
        ASR_PROCESSING_ERROR = c1eph17;
        C1EPH c1eph18 = new C1EPH("ASR_UNKNOWN", 17, 2099);
        ASR_UNKNOWN = c1eph18;
        C1EPH c1eph19 = new C1EPH("NETWORK_CONNECT_TIMEOUT", 18, 3001);
        NETWORK_CONNECT_TIMEOUT = c1eph19;
        C1EPH c1eph20 = new C1EPH("NETWORK_RECEIVE_TIMEOUT", 19, 3002);
        NETWORK_RECEIVE_TIMEOUT = c1eph20;
        C1EPH c1eph21 = new C1EPH("INVALID_RESPONSE", 20, 3003);
        INVALID_RESPONSE = c1eph21;
        C1EPH c1eph22 = new C1EPH("NETWORK_LIB_ERROR", 21, 3004);
        NETWORK_LIB_ERROR = c1eph22;
        C1EPH c1eph23 = new C1EPH("NETWORK_CONNECT_FAILED", 22, 3005);
        NETWORK_CONNECT_FAILED = c1eph23;
        C1EPH c1eph24 = new C1EPH("CREATE_CONNECTION_FAILED", 23, 3006);
        CREATE_CONNECTION_FAILED = c1eph24;
        C1EPH c1eph25 = new C1EPH("AUDIO_ENCODING_ERROR", 24, 4001);
        AUDIO_ENCODING_ERROR = c1eph25;
        C1EPH c1eph26 = new C1EPH("FILE_RECORDER_READ_FAILED", 25, 4002);
        FILE_RECORDER_READ_FAILED = c1eph26;
        C1EPH c1eph27 = new C1EPH("FILE_RECORDER_WRITE_FAILED", 26, 4003);
        FILE_RECORDER_WRITE_FAILED = c1eph27;
        C1EPH c1eph28 = new C1EPH("RECORDER_WRONG_BUF_QUEUE", 27, 4004);
        RECORDER_WRONG_BUF_QUEUE = c1eph28;
        C1EPH c1eph29 = new C1EPH("RECORDER_WRITE_FAILED", 28, 4005);
        RECORDER_WRITE_FAILED = c1eph29;
        C1EPH c1eph30 = new C1EPH("RECORDER_ENQUEUE_FAILED", 29, 4006);
        RECORDER_ENQUEUE_FAILED = c1eph30;
        C1EPH c1eph31 = new C1EPH("RECORDER_SET_FORMAT_FAILED", 30, 4007);
        RECORDER_SET_FORMAT_FAILED = c1eph31;
        C1EPH c1eph32 = new C1EPH("RECORDER_SET_CALLBACK_FAILED", 31, 4008);
        RECORDER_SET_CALLBACK_FAILED = c1eph32;
        C1EPH c1eph33 = new C1EPH("RECORDER_SET_ENABLE_FAILED", 32, 4009);
        RECORDER_SET_ENABLE_FAILED = c1eph33;
        C1EPH c1eph34 = new C1EPH("RECORDER_START_FAILED", 33, 4010);
        RECORDER_START_FAILED = c1eph34;
        C1EPH c1eph35 = new C1EPH("RECORDER_RENDER_FAILED", 34, 4011);
        RECORDER_RENDER_FAILED = c1eph35;
        C1EPH c1eph36 = new C1EPH("RECORDER_INIT_FAILED", 35, 4012);
        RECORDER_INIT_FAILED = c1eph36;
        C1EPH c1eph37 = new C1EPH("OUT_OF_MEMORY", 36, 4013);
        OUT_OF_MEMORY = c1eph37;
        C1EPH c1eph38 = new C1EPH("AUDIO_DATA_DECODE_FAILED", 37, 4014);
        AUDIO_DATA_DECODE_FAILED = c1eph38;
        C1EPH c1eph39 = new C1EPH("EXTERNAL_ERROR", 38, 4015);
        EXTERNAL_ERROR = c1eph39;
        C1EPH c1eph40 = new C1EPH("INIT_GET_OPTION_FAILED", 39, 5001);
        INIT_GET_OPTION_FAILED = c1eph40;
        C1EPH c1eph41 = new C1EPH("INIT_CREATE_INSTANCE_FAILED", 40, 5002);
        INIT_CREATE_INSTANCE_FAILED = c1eph41;
        C1EPH c1eph42 = new C1EPH("INIT_START_WITHOUT_INIT", 41, 5003);
        INIT_START_WITHOUT_INIT = c1eph42;
        C1EPH c1eph43 = new C1EPH("INIT_CRONET_FAILED", 42, 5004);
        INIT_CRONET_FAILED = c1eph43;
        C1EPH c1eph44 = new C1EPH("INIT_CODEC_UNSUPPORTED", 43, 5005);
        INIT_CODEC_UNSUPPORTED = c1eph44;
        C1EPH c1eph45 = new C1EPH("INIT_ADDRESS_INVALID", 44, 5006);
        INIT_ADDRESS_INVALID = c1eph45;
        C1EPH c1eph46 = new C1EPH("INIT_OPEN_FILE_FAILED", 45, 5007);
        INIT_OPEN_FILE_FAILED = c1eph46;
        C1EPH c1eph47 = new C1EPH("INIT_AUDIO_ENGINE_FAILED", 46, 5008);
        INIT_AUDIO_ENGINE_FAILED = c1eph47;
        C1EPH c1eph48 = new C1EPH("INIT_SIGNAL_FAILED", 47, 5009);
        INIT_SIGNAL_FAILED = c1eph48;
        C1EPH c1eph49 = new C1EPH("INIT_RECORD_ENV_OR_BPEA_FAILED", 48, 5010);
        INIT_RECORD_ENV_OR_BPEA_FAILED = c1eph49;
        C1EPH c1eph50 = new C1EPH("INIT_WRONG_STATE", 49, 5011);
        INIT_WRONG_STATE = c1eph50;
        C1EPH c1eph51 = new C1EPH("INIT_AUTH_FAILED", 50, 5012);
        INIT_AUTH_FAILED = c1eph51;
        C1EPH c1eph52 = new C1EPH("INIT_PETREL_FAILED", 51, 5013);
        INIT_PETREL_FAILED = c1eph52;
        C1EPH c1eph53 = new C1EPH("INIT_UNKNOWN_ENGINE_ERROR", 52, 5099);
        INIT_UNKNOWN_ENGINE_ERROR = c1eph53;
        C1EPH c1eph54 = new C1EPH("UNKNOWN", 53, 9000);
        UNKNOWN = c1eph54;
        C1EPH[] c1ephArr = {c1eph, c1eph2, c1eph3, c1eph4, c1eph5, c1eph6, c1eph7, c1eph8, c1eph9, c1eph10, c1eph11, c1eph12, c1eph13, c1eph14, c1eph15, c1eph16, c1eph17, c1eph18, c1eph19, c1eph20, c1eph21, c1eph22, c1eph23, c1eph24, c1eph25, c1eph26, c1eph27, c1eph28, c1eph29, c1eph30, c1eph31, c1eph32, c1eph33, c1eph34, c1eph35, c1eph36, c1eph37, c1eph38, c1eph39, c1eph40, c1eph41, c1eph42, c1eph43, c1eph44, c1eph45, c1eph46, c1eph47, c1eph48, c1eph49, c1eph50, c1eph51, c1eph52, c1eph53, c1eph54};
        LLILLJJLI = c1ephArr;
        LLILLL = new C2254308sP(c1ephArr);
    }

    public static C1EPH[] values() {
        return (C1EPH[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C1EPH valueOf(String str) {
        return (C1EPH) C08FF.LIZ(C1EPH.class, str);
    }

    public C1EPH(String str, int i, int i2) {
        this.LL = i2;
    }
}
