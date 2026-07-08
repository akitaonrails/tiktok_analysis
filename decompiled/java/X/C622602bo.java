package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C622602bo extends Message<C622602bo, C622702bp> {
    public static final ProtoAdapter<C622602bo> ADAPTER = new ProtoAdapter<C622602bo>() { // from class: X.02bn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C622602bo decode(ProtoReader protoReader) {
            C622602bo c622602bo = new C622602bo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c622602bo.survey_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c622602bo.enable_personalized_onboarding_survey = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c622602bo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C622602bo c622602bo) {
            C622602bo c622602bo2 = c622602bo;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c622602bo2.enable_personalized_onboarding_survey) + ProtoAdapter.STRING.encodedSizeWithTag(2, c622602bo2.survey_name) + c622602bo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C622602bo c622602bo) {
            C622602bo c622602bo2 = c622602bo;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c622602bo2.enable_personalized_onboarding_survey);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c622602bo2.survey_name);
            protoWriter.writeBytes(c622602bo2.unknownFields());
        }
    };
    public Boolean enable_personalized_onboarding_survey;
    public String survey_name;

    public C622602bo() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C622702bp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
